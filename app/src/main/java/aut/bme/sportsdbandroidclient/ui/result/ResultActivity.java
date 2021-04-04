package aut.bme.sportsdbandroidclient.ui.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;

public class ResultActivity extends AppCompatActivity implements ResultScreen{
    @Inject
    ResultPresenter resultPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        MainApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        resultPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        resultPresenter.detachScreen();
    }

    @Override
    public void showResult(String match) {

    }
}