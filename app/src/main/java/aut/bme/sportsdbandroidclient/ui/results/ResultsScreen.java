package aut.bme.sportsdbandroidclient.ui.results;

import java.util.List;

import aut.bme.sportsdbandroidclient.model.EventDetails;

public interface ResultsScreen {
    void showResults(List<EventDetails> events);

    void showNetworkError(String errorMsg);
}
