package aut.bme.sportsdbandroidclient.ui.leagues;

import java.util.List;

import aut.bme.sportsdbandroidclient.model.TableTeam;

public interface LeaguesScreen {
    void showLeague(List<TableTeam> teams);

    void showNetworkError(String errorMsg);
}
