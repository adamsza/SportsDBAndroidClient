package aut.bme.sportsdbandroidclient.ui.result;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.ui.Presenter;

public class ResultPresenter extends Presenter<ResultScreen> {
    @Inject
    public ResultPresenter() {
    }

    @Override
    public void attachScreen(ResultScreen screen){
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen(){
        super.detachScreen();
    }

    public void showResultForMatch(String match){
        screen.showResult(match);
    }
}
