package aut.bme.sportsdbandroidclient;

import android.app.Application;

import aut.bme.sportsdbandroidclient.ui.UIModule;

public class MainApplication extends Application{
    public static SportsDBApplicationComponent injector;

    @Override
    public void onCreate(){
        super.onCreate();
        injector = DaggerSportsDBApplicationComponent.builder().uIModule(new UIModule(this)).build();
    }
}
