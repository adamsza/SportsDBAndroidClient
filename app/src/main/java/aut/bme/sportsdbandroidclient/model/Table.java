package aut.bme.sportsdbandroidclient.model;

import java.util.Objects;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import io.swagger.client.model.TableTeam;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Table   {
  
  @SerializedName("table")
  private List<TableTeam> table = new ArrayList<TableTeam>();

  public List<TableTeam> getTable() {
    return table;
  }
  public void setTable(List<TableTeam> table) {
    this.table = table;
  }
}
