package aut.bme.sportsdbandroidclient.mock;

import javax.inject.Singleton;

import aut.bme.sportsdbandroidclient.network.EventApi;
import aut.bme.sportsdbandroidclient.network.TableApi;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MockNetworkModule {

    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create());

    }

    @Provides
    @Singleton
    public EventApi provideEventsApi(Retrofit.Builder retrofitBuilder) {
        return (EventApi) new MockEventApi();
    }


    @Provides
    @Singleton
    public TableApi provideTokenApi(Retrofit.Builder retrofitBuilder) {
        return (TableApi) new MockTableApi();
    }

}
