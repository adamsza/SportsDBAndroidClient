package aut.bme.sportsdbandroidclient.network;

import aut.bme.sportsdbandroidclient.model.Event;
//import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

//import io.swagger.client.model.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventApi {
  
  /**
   * Last 15 Events by League Id
   * 
   * @param id League Id
   * @return Call<Event>
   */
  
  @GET("eventspastleague.php")
  Call<Event> getLast15EventsByLeagueId(
    @Query("id") Long id
  );

  
  /**
   * Event Details by Id
   * 
   * @param id Event Id
   * @return Call<Event>
   */
  
  @GET("lookupevent.php")
  Call<Event> getEventById(
    @Query("id") Long id
  );

  
}
