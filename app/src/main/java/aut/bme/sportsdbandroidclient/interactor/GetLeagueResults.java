package aut.bme.sportsdbandroidclient.interactor;

import java.util.List;

import aut.bme.sportsdbandroidclient.model.EventDetails;
import aut.bme.sportsdbandroidclient.model.TableTeam;

public class GetLeagueResults {
    private int code;
    private List<EventDetails> events;
    private Throwable throwable;

    public GetLeagueResults(){}

    public GetLeagueResults(int code, List<EventDetails> events, Throwable throwable)
    {
        this.code = code;
        this.events = events;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<EventDetails> getEvents() {
        return events;
    }

    public void setEvents(List<EventDetails> events) {
        this.events = events;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
