package aut.bme.sportsdbandroidclient.ui.result;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.interactor.GetLeagueResults;
import aut.bme.sportsdbandroidclient.interactor.GetMatchResult;
import aut.bme.sportsdbandroidclient.interactor.Interactor;
import aut.bme.sportsdbandroidclient.network.Network;
import aut.bme.sportsdbandroidclient.ui.Presenter;

public class ResultPresenter extends Presenter<ResultScreen> {
    Executor networkExecutor;
    Interactor interactor;

    @Inject
    public ResultPresenter(@Network Executor networkExecutor, Interactor interactor) {
        this.networkExecutor = networkExecutor;
        this.interactor = interactor;
    }

    @Override
    public void attachScreen(ResultScreen screen){
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen(){
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    public void showResultForMatch(long id){
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                interactor.getMatchResult(id);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetMatchResult result) {
        if (result.getThrowable() != null) {
            result.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(result.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showResults(result.getEvents());
            }
        }
    }
}
