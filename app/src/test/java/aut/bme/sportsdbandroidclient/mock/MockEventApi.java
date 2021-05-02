package aut.bme.sportsdbandroidclient.mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import aut.bme.sportsdbandroidclient.model.Event;
import aut.bme.sportsdbandroidclient.model.EventDetails;
import aut.bme.sportsdbandroidclient.network.EventApi;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MockEventApi implements EventApi {
    @Override
    public Call<Event> getLast15EventsByLeagueId(Long id) {
        final Event event = new Event();

        List<EventDetails> events = new ArrayList<EventDetails>();

        for(int i = 0; i < 15; i++)
        {
            EventDetails eventDetails = new EventDetails();
            eventDetails.setIntHomeScore((long) i%5);
            eventDetails.setIntAwayScore((long) (i+1)%4);
            eventDetails.setStrHomeTeam("Hazai Csapat " + (i+1));
            eventDetails.setStrAwayTeam("Vendég Csapat " + (i+1));
            events.add(eventDetails);
        }

        event.setEvents(events);

        Call<Event> call = new Call<Event>() {
            @Override
            public Response<Event> execute() throws IOException {
                return Response.success(event);
            }

            @Override
            public void enqueue(Callback<Event> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<Event> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<Event> getEventById(Long id) {
        final Event event = new Event();

        List<EventDetails> events = new ArrayList<EventDetails>();

        EventDetails eventDetails = new EventDetails();
        eventDetails.setIntHomeScore((long) 2);
        eventDetails.setIntAwayScore((long) 1);
        eventDetails.setStrHomeTeam("Hazai Csapat");
        eventDetails.setStrAwayTeam("Vendég Csapat");
        events.add(eventDetails);

        event.setEvents(events);

        Call<Event> call = new Call<Event>() {
            @Override
            public Response<Event> execute() throws IOException {
                return Response.success(event);
            }

            @Override
            public void enqueue(Callback<Event> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<Event> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }
}
