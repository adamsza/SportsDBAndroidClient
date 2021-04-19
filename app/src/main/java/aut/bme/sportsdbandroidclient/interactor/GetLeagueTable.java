package aut.bme.sportsdbandroidclient.interactor;

import aut.bme.sportsdbandroidclient.model.TableTeam;
import java.util.List;

public class GetLeagueTable {
    private int code;
    private List<TableTeam> teams;
    private Throwable throwable;

    public GetLeagueTable(){}

    public GetLeagueTable(int code, List<TableTeam> teams, Throwable throwable)
    {
        this.code = code;
        this.teams = teams;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<TableTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<TableTeam> teams) {
        this.teams = teams;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
