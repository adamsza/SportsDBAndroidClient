package aut.bme.sportsdbandroidclient.ui.result;

import java.util.List;

import aut.bme.sportsdbandroidclient.model.EventDetails;

public interface ResultScreen {
    void showResults(List<EventDetails> events);

    void showNetworkError(String errorMsg);
}
