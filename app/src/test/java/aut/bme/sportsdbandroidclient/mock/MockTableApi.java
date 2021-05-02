package aut.bme.sportsdbandroidclient.mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import aut.bme.sportsdbandroidclient.model.Table;
import aut.bme.sportsdbandroidclient.model.TableTeam;
import aut.bme.sportsdbandroidclient.model.Table;
import aut.bme.sportsdbandroidclient.network.TableApi;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MockTableApi implements TableApi {
    @Override
    public Call<Table> getTableById(Long l, String s) {
        final Table table = new Table();

        List<TableTeam> teams = new ArrayList<TableTeam>();

        for(int i = 0; i < 15; i++)
        {
            TableTeam team = new TableTeam();
            team.setIntRank((long) (i+1));
            team.setIntPlayed((long) 22);
            team.setIntWin((long) (22-i));
            team.setIntLoss((long) i);
            team.setIntDraw((long) 0);
            team.setIntPoints((long) ((22-i)*3));
            team.setStrTeam("Csapat" + (i+1));
            teams.add(team);
        }

        table.setTable(teams);

        Call<Table> call = new Call<Table>() {
            @Override
            public Response<Table> execute() throws IOException {
                return Response.success(table);
            }

            @Override
            public void enqueue(Callback<Table> callback) {

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
            public Call<Table> clone() {
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
