package aut.bme.sportsdbandroidclient.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FavouriteTeamDAO {
    @Query("Select * from favourite_team")
    List<FavouriteTeam> getFavouriteTeams();

    @Insert
    void insertFavouriteTeam(FavouriteTeam favouriteTeam);

    @Update
    void updateFavouriteTeam(FavouriteTeam favouriteTeam);

    @Delete
    void deleteFavouriteTeam(FavouriteTeam favouriteTeam);
}
