package aut.bme.sportsdbandroidclient.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;

import java.util.List;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.DaggerTestComponent;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesPresenter;
import aut.bme.sportsdbandroidclient.ui.leagues.LeaguesScreen;

import static aut.bme.sportsdbandroidclient.TestHelper.setTestInjector;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class LeaguesTest {
    @Inject
    LeaguesPresenter leaguesPresenter;
    private LeaguesScreen leaguesScreen;

    @Before
    public void setup() {
        DaggerTestComponent injector = setTestInjector();
        injector.inject(this);
        leaguesScreen = mock(LeaguesScreen.class);
        leaguesPresenter.attachScreen(leaguesScreen);
    }

    @Test
    public void testLeagues() {
        long id = 4328;
        String season = "2020-2021";
        leaguesPresenter.showSelectedLeague(id, season);

        ArgumentCaptor<List> leaguesCaptor = ArgumentCaptor.forClass(List.class);
        verify(leaguesScreen).showLeague(leaguesCaptor.capture());
        assertTrue(leaguesCaptor.getValue().size() > 0);
    }


    @After
    public void tearDown() {
        leaguesPresenter.detachScreen();
    }
}
