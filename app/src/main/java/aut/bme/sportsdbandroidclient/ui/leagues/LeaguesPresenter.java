package aut.bme.sportsdbandroidclient.ui.leagues;

import javax.inject.Inject;
import aut.bme.sportsdbandroidclient.ui.Presenter;

public class LeaguesPresenter extends Presenter<LeaguesScreen> {
    @Inject
    public LeaguesPresenter(){
    }

    @Override
    public void attachScreen(LeaguesScreen screen){
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen(){
        super.detachScreen();
    }

    public void showSelectedLeague(String leagueName){
        screen.showLeague(leagueName);
    }
}
