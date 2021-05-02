package aut.bme.sportsdbandroidclient.ui.leagues;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

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
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;
import aut.bme.sportsdbandroidclient.model.Table;
import aut.bme.sportsdbandroidclient.model.TableTeam;
import aut.bme.sportsdbandroidclient.ui.results.ResultsActivity;

public class LeaguesActivity extends AppCompatActivity implements LeaguesScreen, AdapterView.OnItemSelectedListener {

    @Inject
    LeaguesPresenter leaguesPresenter;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);
        MainApplication.injector.inject(this);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle(R.string.league);
        setSupportActionBar(myToolbar);

        Spinner spinner = (Spinner) findViewById(R.id.leagues_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.leagues_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        table = (TableLayout) findViewById(R.id.league_table);
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

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        long league_id = 0;
        switch (pos)
        {
            case 0 : league_id = 4334;break;
            case 1 : league_id = 4332;break;
            case 2 : league_id = 4331;break;
            case 3 : league_id = 4335;break;
            case 4 : league_id = 4328;break;
            default: league_id = 4328;break;
        }

        leaguesPresenter.showSelectedLeague(league_id, "2020-2021");
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        leaguesPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        leaguesPresenter.detachScreen();
    }

    @Override
    public void showLeague(List<TableTeam> teams) {
        table.removeViews(1, table.getChildCount() - 1);
        Collections.sort(teams, (o1, o2) -> (int) (o1.getIntRank() - o2.getIntRank()));
        for (TableTeam t: teams
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
            tv.setText(t.getIntRank().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getStrTeam());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getIntPlayed().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getIntWin().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getIntDraw().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getIntLoss().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            tv = new TextView(this);
            tv.setText(t.getIntPoints().toString());
            tv.setPadding(20, 20,20,20);
            row.addView(tv);
            table.addView(row);
        }
    }

    @Override
    public void showNetworkError(String errorMsg) {

    }
}