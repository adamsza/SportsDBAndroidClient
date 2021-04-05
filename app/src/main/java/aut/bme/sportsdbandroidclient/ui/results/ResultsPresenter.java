package aut.bme.sportsdbandroidclient.ui.results;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.ui.Presenter;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesScreen;

public class ResultsPresenter extends Presenter<ResultsScreen> {
    @Inject
    public ResultsPresenter() {
    }

    @Override
    public void attachScreen(ResultsScreen screen){
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen(){
        super.detachScreen();
    }

    public void showResultsForLeague(String leagueName){
        screen.showResults(leagueName);
    }
}
