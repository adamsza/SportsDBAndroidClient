package aut.bme.sportsdbandroidclient.model;

import java.util.Objects;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;



public class TableTeam   {
  
  @SerializedName("idStanding")
  private Long idStanding = null;
  
  @SerializedName("intRank")
  private Long intRank = null;
  
  @SerializedName("idTeam")
  private Long idTeam = null;
  
  @SerializedName("strTeam")
  private String strTeam = null;
  
  @SerializedName("strTeamBadge")
  private String strTeamBadge = null;
  
  @SerializedName("idLeague")
  private Long idLeague = null;
  
  @SerializedName("strLeague")
  private String strLeague = null;
  
  @SerializedName("strSeason")
  private String strSeason = null;
  
  @SerializedName("strForm")
  private String strForm = null;
  
  @SerializedName("strDescription")
  private String strDescription = null;
  
  @SerializedName("intPlayed")
  private Long intPlayed = null;
  
  @SerializedName("intWin")
  private Long intWin = null;
  
  @SerializedName("intLoss")
  private Long intLoss = null;
  
  @SerializedName("intDraw")
  private Long intDraw = null;
  
  @SerializedName("intGoalsFor")
  private Long intGoalsFor = null;
  
  @SerializedName("intGoalsAgainst")
  private Long intGoalsAgainst = null;
  
  @SerializedName("intGoalDifference")
  private Long intGoalDifference = null;
  
  @SerializedName("intPoints")
  private Long intPoints = null;
  
  @SerializedName("dateUpdated")
  private String dateUpdated = null;

  public Long getIdStanding() {
    return idStanding;
  }
  public void setIdStanding(Long idStanding) {
    this.idStanding = idStanding;
  }

  public Long getIntRank() {
    return intRank;
  }
  public void setIntRank(Long intRank) {
    this.intRank = intRank;
  }

  public Long getIdTeam() {
    return idTeam;
  }
  public void setIdTeam(Long idTeam) {
    this.idTeam = idTeam;
  }

  public String getStrTeam() {
    return strTeam;
  }
  public void setStrTeam(String strTeam) {
    this.strTeam = strTeam;
  }

  public String getStrTeamBadge() {
    return strTeamBadge;
  }
  public void setStrTeamBadge(String strTeamBadge) {
    this.strTeamBadge = strTeamBadge;
  }

  public Long getIdLeague() {
    return idLeague;
  }
  public void setIdLeague(Long idLeague) {
    this.idLeague = idLeague;
  }

  public String getStrLeague() {
    return strLeague;
  }
  public void setStrLeague(String strLeague) {
    this.strLeague = strLeague;
  }

  public String getStrSeason() {
    return strSeason;
  }
  public void setStrSeason(String strSeason) {
    this.strSeason = strSeason;
  }

  //@ApiModelProperty(value = "")
  public String getStrForm() {
    return strForm;
  }
  public void setStrForm(String strForm) {
    this.strForm = strForm;
  }

  public String getStrDescription() {
    return strDescription;
  }
  public void setStrDescription(String strDescription) {
    this.strDescription = strDescription;
  }

  public Long getIntPlayed() {
    return intPlayed;
  }
  public void setIntPlayed(Long intPlayed) {
    this.intPlayed = intPlayed;
  }

  public Long getIntWin() {
    return intWin;
  }
  public void setIntWin(Long intWin) {
    this.intWin = intWin;
  }

  public Long getIntLoss() {
    return intLoss;
  }
  public void setIntLoss(Long intLoss) {
    this.intLoss = intLoss;
  }

  public Long getIntDraw() {
    return intDraw;
  }
  public void setIntDraw(Long intDraw) {
    this.intDraw = intDraw;
  }

  public Long getIntGoalsFor() {
    return intGoalsFor;
  }
  public void setIntGoalsFor(Long intGoalsFor) {
    this.intGoalsFor = intGoalsFor;
  }

  public Long getIntGoalsAgainst() {
    return intGoalsAgainst;
  }
  public void setIntGoalsAgainst(Long intGoalsAgainst) {
    this.intGoalsAgainst = intGoalsAgainst;
  }

  public Long getIntGoalDifference() {
    return intGoalDifference;
  }
  public void setIntGoalDifference(Long intGoalDifference) {
    this.intGoalDifference = intGoalDifference;
  }

  public Long getIntPoints() {
    return intPoints;
  }
  public void setIntPoints(Long intPoints) {
    this.intPoints = intPoints;
  }

  public String getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }
}
