package aut.bme.sportsdbandroidclient.ui.leagues;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;

public class LeaguesActivity extends AppCompatActivity implements LeaguesScreen {

    @Inject
    LeaguesPresenter leaguesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);

        MainApplication.injector.inject(this);
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
    public void showLeague(String artistSearchTerm) {
        
    }
}