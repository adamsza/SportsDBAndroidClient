package aut.bme.sportsdbandroidclient.interactor;

import java.util.List;

import aut.bme.sportsdbandroidclient.model.EventDetails;

public class GetMatchResult {
    private int code;
    private List<EventDetails> events;
    private Throwable throwable;

    public GetMatchResult(){}

    public GetMatchResult(int code, List<EventDetails> events, Throwable throwable)
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
