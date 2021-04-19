package aut.bme.sportsdbandroidclient.network;

import aut.bme.sportsdbandroidclient.model.Table;
//import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

//import io.swagger.client.model.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TableApi {
  
  /**
   * Lookup Table by League ID and Season
   * 
   * @param l League Id
   * @param s Season
   * @return Call<Table>
   */
  
  @GET("lookuptable.php")
  Call<Table> getTableById(
    @Query("l") Long l, @Query("s") String s
  );

  
}
