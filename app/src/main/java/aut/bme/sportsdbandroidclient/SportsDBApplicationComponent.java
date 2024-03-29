package aut.bme.sportsdbandroidclient;

import javax.inject.Singleton;

import aut.bme.sportsdbandroidclient.interactor.Interactor;
import aut.bme.sportsdbandroidclient.network.NetworkModule;
import aut.bme.sportsdbandroidclient.ui.UIModule;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesActivity;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesPresenter;
import aut.bme.sportsdbandroidclient.ui.result.ResultActivity;
import aut.bme.sportsdbandroidclient.ui.result.ResultPresenter;
import aut.bme.sportsdbandroidclient.ui.results.ResultsActivity;
import aut.bme.sportsdbandroidclient.ui.results.ResultsPresenter;
import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class})
public interface SportsDBApplicationComponent {
    void inject(LeaguesActivity leaguesActivity);
    void inject(ResultsActivity resultsActivity);
    void inject(ResultActivity resultActivity);
    void inject(LeaguesPresenter leaguesPresenter);
    void inject(ResultsPresenter resultsPresenter);
    void inject(ResultPresenter resultPresenter);
    void inject(Interactor interactor);
}
