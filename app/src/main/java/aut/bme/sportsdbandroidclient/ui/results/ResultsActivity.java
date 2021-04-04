package aut.bme.sportsdbandroidclient.ui.results;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesPresenter;

public class ResultsActivity extends AppCompatActivity implements ResultsScreen{

    @Inject
    ResultsPresenter resultsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        MainApplication.injector.inject(this);
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
    public void showResults(String artistSearchTerm) {

    }
}