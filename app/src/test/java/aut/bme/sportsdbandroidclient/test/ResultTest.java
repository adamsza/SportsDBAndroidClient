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
import aut.bme.sportsdbandroidclient.ui.result.ResultPresenter;
import aut.bme.sportsdbandroidclient.ui.result.ResultScreen;

import static aut.bme.sportsdbandroidclient.TestHelper.setTestInjector;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class ResultTest {
    @Inject
    ResultPresenter resultPresenter;
    private ResultScreen resultScreen;

    @Before
    public void setup() {
        DaggerTestComponent injector = setTestInjector();
        injector.inject(this);
        resultScreen = mock(ResultScreen.class);
        resultPresenter.attachScreen(resultScreen);
    }

    @Test
    public void testResult() {
        long query = 441613;
        resultPresenter.showResultForMatch(query);

        ArgumentCaptor<List> resultCaptor = ArgumentCaptor.forClass(List.class);
        verify(resultScreen).showResults(resultCaptor.capture());
        assertTrue(resultCaptor.getValue().size() > 0);
    }


    @After
    public void tearDown() {
        resultPresenter.detachScreen();
    }
}
