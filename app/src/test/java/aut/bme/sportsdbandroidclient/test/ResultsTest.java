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
import aut.bme.sportsdbandroidclient.ui.results.ResultsPresenter;
import aut.bme.sportsdbandroidclient.ui.results.ResultsScreen;

import static aut.bme.sportsdbandroidclient.TestHelper.setTestInjector;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class ResultsTest {
    @Inject
    ResultsPresenter resultsPresenter;
    private ResultsScreen resultsScreen;

    @Before
    public void setup() {
        DaggerTestComponent injector = setTestInjector();
        injector.inject(this);
        resultsScreen = mock(ResultsScreen.class);
        resultsPresenter.attachScreen(resultsScreen);
    }

    @Test
    public void testResults() {
        long query = 4328;
        resultsPresenter.showResultsForLeague(query);

        ArgumentCaptor<List> resultsCaptor = ArgumentCaptor.forClass(List.class);
        verify(resultsScreen).showResults(resultsCaptor.capture());
        assertTrue(resultsCaptor.getValue().size() > 0);
    }


    @After
    public void tearDown() {
        resultsPresenter.detachScreen();
    }
}
