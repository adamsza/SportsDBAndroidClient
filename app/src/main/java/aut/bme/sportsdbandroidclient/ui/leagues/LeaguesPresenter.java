package aut.bme.sportsdbandroidclient.ui.leagues;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.interactor.GetLeagueTable;
import aut.bme.sportsdbandroidclient.interactor.Interactor;
import aut.bme.sportsdbandroidclient.model.Event;
import aut.bme.sportsdbandroidclient.network.Network;
import aut.bme.sportsdbandroidclient.ui.Presenter;

public class LeaguesPresenter extends Presenter<LeaguesScreen> {
    Executor networkExecutor;
    Interactor interactor;

    @Inject
    public LeaguesPresenter(@Network Executor networkExecutor, Interactor interactor){
        this.networkExecutor = networkExecutor;
        this.interactor = interactor;
    }

    @Override
    public void attachScreen(LeaguesScreen screen){
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen(){
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    public void showSelectedLeague(long id, String season){
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                interactor.getLeagueTable(id, season);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetLeagueTable table) {
        if (table.getThrowable() != null) {
            table.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(table.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showLeague(table.getTeams());
            }
        }
    }
}
