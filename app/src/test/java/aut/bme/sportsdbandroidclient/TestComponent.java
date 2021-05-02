package aut.bme.sportsdbandroidclient;

import javax.inject.Singleton;

import aut.bme.sportsdbandroidclient.mock.MockNetworkModule;
import aut.bme.sportsdbandroidclient.test.LeaguesTest;
import aut.bme.sportsdbandroidclient.test.ResultTest;
import aut.bme.sportsdbandroidclient.test.ResultsTest;
import dagger.Component;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class})
public interface TestComponent extends SportsDBApplicationComponent {
    void inject(ResultsTest resultsTest);

    void inject(ResultTest resultTest);

    void inject(LeaguesTest leaguesTest);
}