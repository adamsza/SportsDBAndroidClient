package aut.bme.sportsdbandroidclient.ui;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

import aut.bme.sportsdbandroidclient.network.Network;
import dagger.Module;
import dagger.Provides;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context){
        this.context = context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor(){
        return Executors.newFixedThreadPool(1);
    }
}
