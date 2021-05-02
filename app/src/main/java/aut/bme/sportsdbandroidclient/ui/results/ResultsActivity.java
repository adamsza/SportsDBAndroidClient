package aut.bme.sportsdbandroidclient.ui.results;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;
import aut.bme.sportsdbandroidclient.model.EventDetails;
import aut.bme.sportsdbandroidclient.model.TableTeam;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesActivity;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesPresenter;
import aut.bme.sportsdbandroidclient.ui.result.ResultActivity;

public class ResultsActivity extends AppCompatActivity implements ResultsScreen, AdapterView.OnItemSelectedListener{

    @Inject
    ResultsPresenter resultsPresenter;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        MainApplication.injector.inject(this);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle(R.string.result);
        setSupportActionBar(myToolbar);

        Spinner spinner = (Spinner) findViewById(R.id.results_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.leagues_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        table = (TableLayout) findViewById(R.id.results_table);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_results:
                Intent resultActivity = new Intent(this, ResultsActivity.class);
                startActivity(resultActivity);
                return true;
            case R.id.action_leagues:
                Intent leagueActivity = new Intent(this, LeaguesActivity.class);
                startActivity(leagueActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        resultsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        resultsPresenter.detachScreen();
    }

    @Override
    public void showResults(List<EventDetails> events) {
        if(table.getChildCount() > 0) table.removeAllViews();
        for (EventDetails e: events
        ) {
            TableRow row = new TableRow(this);
            TableLayout.LayoutParams tableRowParams=
                    new TableLayout.LayoutParams
                            (TableLayout.LayoutParams.FILL_PARENT,TableLayout.LayoutParams.WRAP_CONTENT);
            tableRowParams.setMargins(0, 7, 0, 7);
            row.setLayoutParams(tableRowParams);
            row.setWeightSum(20);
            row.setBackgroundColor(0xFFE6E6E6);

            TextView tv;
            tv = new TextView(this);
            tv.setText(e.getStrHomeTeam());
            tv.setPadding(20, 20, 20, 20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(e.getIntHomeScore().toString() + " : " + e.getIntAwayScore());
            tv.setPadding(20, 20, 20, 20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(e.getStrAwayTeam());
            tv.setPadding(20, 20,20,20);
            tv.setGravity(Gravity.RIGHT);
            row.addView(tv);
            row.setOnClickListener((new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent resultActivity = new Intent(ResultsActivity.this, ResultActivity.class);
                    resultActivity.putExtra("match_id", e.getIdEvent());
                    startActivity(resultActivity);
                }
            }));
            table.addView(row);
        }
    }

    @Override
    public void showNetworkError(String errorMsg) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        long league_id = 0;
        switch (position)
        {
            case 0 : league_id = 4334;break;
            case 1 : league_id = 4332;break;
            case 2 : league_id = 4331;break;
            case 3 : league_id = 4335;break;
            case 4 : league_id = 4328;break;
            default: league_id = 4328;break;
        }

        resultsPresenter.showResultsForLeague(league_id);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}