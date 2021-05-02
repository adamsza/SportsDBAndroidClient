package aut.bme.sportsdbandroidclient;

import android.content.Context;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import aut.bme.sportsdbandroidclient.network.Network;
import aut.bme.sportsdbandroidclient.utils.UiExecutor;
import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {

    private Context context;

    public TestModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor() {
        return new UiExecutor();
    }


}