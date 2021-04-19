package aut.bme.sportsdbandroidclient.model;

import java.util.Objects;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import io.swagger.client.model.EventDetails;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;



public class Event   {
  
  @SerializedName("events")
  private List<EventDetails> events = new ArrayList<EventDetails>();

  public List<EventDetails> getEvents() {
    return events;
  }
  public void setEvents(List<EventDetails> events) {
    this.events = events;
  }
}
