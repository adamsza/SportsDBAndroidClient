package aut.bme.sportsdbandroidclient.ui.results;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.interactor.GetLeagueResults;
import aut.bme.sportsdbandroidclient.interactor.GetLeagueTable;
import aut.bme.sportsdbandroidclient.interactor.Interactor;
import aut.bme.sportsdbandroidclient.network.Network;
import aut.bme.sportsdbandroidclient.ui.Presenter;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesScreen;

public class ResultsPresenter extends Presenter<ResultsScreen> {
    Executor networkExecutor;
    Interactor interactor;

    @Inject
    public ResultsPresenter(@Network Executor networkExecutor, Interactor interactor) {
        this.networkExecutor = networkExecutor;
        this.interactor = interactor;
    }

    @Override
    public void attachScreen(ResultsScreen screen){
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen(){
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    public void showResultsForLeague(long id){
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                interactor.getLeagueResults(id);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetLeagueResults results) {
        if (results.getThrowable() != null) {
            results.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(results.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showResults(results.getEvents());
            }
        }
    }
}
