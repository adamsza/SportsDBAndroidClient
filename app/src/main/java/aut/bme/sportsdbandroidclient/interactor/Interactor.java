package aut.bme.sportsdbandroidclient.interactor;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.model.Event;
import aut.bme.sportsdbandroidclient.model.Table;
import aut.bme.sportsdbandroidclient.network.EventApi;
import aut.bme.sportsdbandroidclient.network.TableApi;
import retrofit2.Call;
import retrofit2.Response;

public class Interactor {

    TableApi tableApi;
    EventApi eventApi;

    @Inject
    public Interactor(TableApi tableApi, EventApi eventApi){
        this.tableApi = tableApi;
        this.eventApi = eventApi;
    }

    public void getLeagueTable(long leagueId, String season){
        GetLeagueTable table = new GetLeagueTable();
        try {
            Call<Table> tableQueryCall = tableApi.getTableById(leagueId, season);

            Response<Table> response = tableQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            table.setCode(response.code());
            table.setTeams(response.body().getTable());
            EventBus.getDefault().post(table);
        }catch (Exception e) {
            table.setThrowable(e);
            EventBus.getDefault().post(table);
        }
    }

    public void getLeagueResults(long leagueId){
        GetLeagueResults events = new GetLeagueResults();
        try {
            Call<Event> eventsQueryCall = eventApi.getLast15EventsByLeagueId(leagueId);

            Response<Event> response = eventsQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            events.setCode(response.code());
            events.setEvents(response.body().getEvents());
            EventBus.getDefault().post(events);
        }catch (Exception e) {
            events.setThrowable(e);
            EventBus.getDefault().post(events);
        }
    }

    public void getMatchResult(long eventId){
        GetMatchResult result = new GetMatchResult();
        try {
            Call<Event> matchQueryCall = eventApi.getEventById(eventId);

            Response<Event> response = matchQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            result.setCode(response.code());
            result.setEvents(response.body().getEvents());
            EventBus.getDefault().post(result);
        }catch (Exception e) {
            result.setThrowable(e);
            EventBus.getDefault().post(result);
        }
    }
}
