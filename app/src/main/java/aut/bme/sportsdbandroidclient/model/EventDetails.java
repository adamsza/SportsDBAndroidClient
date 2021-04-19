package aut.bme.sportsdbandroidclient.model;

import java.util.Objects;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;



public class EventDetails   {
  
  @SerializedName("idEvent")
  private Long idEvent = null;
  
  @SerializedName("idSoccerXML")
  private Long idSoccerXML = null;
  
  @SerializedName("idAPIfootball")
  private Long idAPIfootball = null;
  
  @SerializedName("strEvent")
  private String strEvent = null;
  
  @SerializedName("strEventAlternate")
  private String strEventAlternate = null;
  
  @SerializedName("strFilename")
  private String strFilename = null;
  
  @SerializedName("strSport")
  private String strSport = null;
  
  @SerializedName("idLeague")
  private Long idLeague = null;
  
  @SerializedName("strLeague")
  private String strLeague = null;
  
  @SerializedName("strSeason")
  private String strSeason = null;
  
  @SerializedName("strDescriptionEN")
  private String strDescriptionEN = null;
  
  @SerializedName("strHomeTeam")
  private String strHomeTeam = null;
  
  @SerializedName("strAwayTeam")
  private String strAwayTeam = null;
  
  @SerializedName("intHomeScore")
  private Long intHomeScore = null;
  
  @SerializedName("intRound")
  private Long intRound = null;
  
  @SerializedName("intAwayScore")
  private Long intAwayScore = null;
  
  @SerializedName("intSpectators")
  private Long intSpectators = null;
  
  @SerializedName("strOfficial")
  private String strOfficial = null;
  
  @SerializedName("strHomeGoalDetails")
  private String strHomeGoalDetails = null;
  
  @SerializedName("strHomeRedCards")
  private String strHomeRedCards = null;
  
  @SerializedName("strHomeYellowCards")
  private String strHomeYellowCards = null;
  
  @SerializedName("strHomeLineupGoalkeeper")
  private String strHomeLineupGoalkeeper = null;
  
  @SerializedName("strHomeLineupDefense")
  private String strHomeLineupDefense = null;
  
  @SerializedName("strHomeLineupMidfield")
  private String strHomeLineupMidfield = null;
  
  @SerializedName("strHomeLineupForward")
  private String strHomeLineupForward = null;
  
  @SerializedName("strHomeLineupSubstitutes")
  private String strHomeLineupSubstitutes = null;
  
  @SerializedName("strHomeFormation")
  private String strHomeFormation = null;
  
  @SerializedName("strAwayRedCards")
  private String strAwayRedCards = null;
  
  @SerializedName("strAwayYellowCards")
  private String strAwayYellowCards = null;
  
  @SerializedName("strAwayGoalDetails")
  private String strAwayGoalDetails = null;
  
  @SerializedName("strAwayLineupGoalkeeper")
  private String strAwayLineupGoalkeeper = null;
  
  @SerializedName("strAwayLineupDefense")
  private String strAwayLineupDefense = null;
  
  @SerializedName("strAwayLineupMidfield")
  private String strAwayLineupMidfield = null;
  
  @SerializedName("strAwayLineupForward")
  private String strAwayLineupForward = null;
  
  @SerializedName("strAwayLineupSubstitutes")
  private String strAwayLineupSubstitutes = null;
  
  @SerializedName("strAwayFormation")
  private String strAwayFormation = null;
  
  @SerializedName("intHomeShots")
  private Long intHomeShots = null;
  
  @SerializedName("intAwayShots")
  private Long intAwayShots = null;
  
  @SerializedName("strTimestamp")
  private String strTimestamp = null;
  
  @SerializedName("dateEvent")
  private String dateEvent = null;
  
  @SerializedName("dateEventLocal")
  private String dateEventLocal = null;
  
  @SerializedName("strTime")
  private String strTime = null;
  
  @SerializedName("strTimeLocal")
  private String strTimeLocal = null;
  
  @SerializedName("strTVStation")
  private String strTVStation = null;
  
  @SerializedName("idHomeTeam")
  private Long idHomeTeam = null;
  
  @SerializedName("idAwayTeam")
  private Long idAwayTeam = null;
  
  @SerializedName("strResult")
  private String strResult = null;
  
  @SerializedName("strVenue")
  private String strVenue = null;
  
  @SerializedName("strCountry")
  private String strCountry = null;
  
  @SerializedName("strCity")
  private String strCity = null;
  
  @SerializedName("strPoster")
  private String strPoster = null;
  
  @SerializedName("strSquare")
  private String strSquare = null;
  
  @SerializedName("strFanart")
  private String strFanart = null;
  
  @SerializedName("strThumb")
  private String strThumb = null;
  
  @SerializedName("strBanner")
  private String strBanner = null;
  
  @SerializedName("strMap")
  private String strMap = null;
  
  @SerializedName("strTweet1")
  private String strTweet1 = null;
  
  @SerializedName("strTweet2")
  private String strTweet2 = null;
  
  @SerializedName("strTweet3")
  private String strTweet3 = null;
  
  @SerializedName("strVideo")
  private String strVideo = null;
  
  @SerializedName("strStatus")
  private String strStatus = null;
  
  @SerializedName("strPostponed")
  private String strPostponed = null;
  
  @SerializedName("strLocked")
  private String strLocked = null;

  public Long getIdEvent() {
    return idEvent;
  }
  public void setIdEvent(Long idEvent) {
    this.idEvent = idEvent;
  }

  public Long getIdSoccerXML() {
    return idSoccerXML;
  }
  public void setIdSoccerXML(Long idSoccerXML) {
    this.idSoccerXML = idSoccerXML;
  }

  public Long getIdAPIfootball() {
    return idAPIfootball;
  }
  public void setIdAPIfootball(Long idAPIfootball) {
    this.idAPIfootball = idAPIfootball;
  }

  public String getStrEvent() {
    return strEvent;
  }
  public void setStrEvent(String strEvent) {
    this.strEvent = strEvent;
  }

  public String getStrEventAlternate() {
    return strEventAlternate;
  }
  public void setStrEventAlternate(String strEventAlternate) {
    this.strEventAlternate = strEventAlternate;
  }

  public String getStrFilename() {
    return strFilename;
  }
  public void setStrFilename(String strFilename) {
    this.strFilename = strFilename;
  }

  public String getStrSport() {
    return strSport;
  }
  public void setStrSport(String strSport) {
    this.strSport = strSport;
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

  public String getStrDescriptionEN() {
    return strDescriptionEN;
  }
  public void setStrDescriptionEN(String strDescriptionEN) {
    this.strDescriptionEN = strDescriptionEN;
  }

  public String getStrHomeTeam() {
    return strHomeTeam;
  }
  public void setStrHomeTeam(String strHomeTeam) {
    this.strHomeTeam = strHomeTeam;
  }

  public String getStrAwayTeam() {
    return strAwayTeam;
  }
  public void setStrAwayTeam(String strAwayTeam) {
    this.strAwayTeam = strAwayTeam;
  }

  public Long getIntHomeScore() {
    return intHomeScore;
  }
  public void setIntHomeScore(Long intHomeScore) {
    this.intHomeScore = intHomeScore;
  }

  public Long getIntRound() {
    return intRound;
  }
  public void setIntRound(Long intRound) {
    this.intRound = intRound;
  }

  public Long getIntAwayScore() {
    return intAwayScore;
  }
  public void setIntAwayScore(Long intAwayScore) {
    this.intAwayScore = intAwayScore;
  }

  public Long getIntSpectators() {
    return intSpectators;
  }
  public void setIntSpectators(Long intSpectators) {
    this.intSpectators = intSpectators;
  }

  public String getStrOfficial() {
    return strOfficial;
  }
  public void setStrOfficial(String strOfficial) {
    this.strOfficial = strOfficial;
  }

  public String getStrHomeGoalDetails() {
    return strHomeGoalDetails;
  }
  public void setStrHomeGoalDetails(String strHomeGoalDetails) {
    this.strHomeGoalDetails = strHomeGoalDetails;
  }

  public String getStrHomeRedCards() {
    return strHomeRedCards;
  }
  public void setStrHomeRedCards(String strHomeRedCards) {
    this.strHomeRedCards = strHomeRedCards;
  }

  public String getStrHomeYellowCards() {
    return strHomeYellowCards;
  }
  public void setStrHomeYellowCards(String strHomeYellowCards) {
    this.strHomeYellowCards = strHomeYellowCards;
  }

  public String getStrHomeLineupGoalkeeper() {
    return strHomeLineupGoalkeeper;
  }
  public void setStrHomeLineupGoalkeeper(String strHomeLineupGoalkeeper) {
    this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
  }

  public String getStrHomeLineupDefense() {
    return strHomeLineupDefense;
  }
  public void setStrHomeLineupDefense(String strHomeLineupDefense) {
    this.strHomeLineupDefense = strHomeLineupDefense;
  }

  public String getStrHomeLineupMidfield() {
    return strHomeLineupMidfield;
  }
  public void setStrHomeLineupMidfield(String strHomeLineupMidfield) {
    this.strHomeLineupMidfield = strHomeLineupMidfield;
  }

  public String getStrHomeLineupForward() {
    return strHomeLineupForward;
  }
  public void setStrHomeLineupForward(String strHomeLineupForward) {
    this.strHomeLineupForward = strHomeLineupForward;
  }

  public String getStrHomeLineupSubstitutes() {
    return strHomeLineupSubstitutes;
  }
  public void setStrHomeLineupSubstitutes(String strHomeLineupSubstitutes) {
    this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
  }

  public String getStrHomeFormation() {
    return strHomeFormation;
  }
  public void setStrHomeFormation(String strHomeFormation) {
    this.strHomeFormation = strHomeFormation;
  }

  public String getStrAwayRedCards() {
    return strAwayRedCards;
  }
  public void setStrAwayRedCards(String strAwayRedCards) {
    this.strAwayRedCards = strAwayRedCards;
  }

  public String getStrAwayYellowCards() {
    return strAwayYellowCards;
  }
  public void setStrAwayYellowCards(String strAwayYellowCards) {
    this.strAwayYellowCards = strAwayYellowCards;
  }

  public String getStrAwayGoalDetails() {
    return strAwayGoalDetails;
  }
  public void setStrAwayGoalDetails(String strAwayGoalDetails) {
    this.strAwayGoalDetails = strAwayGoalDetails;
  }

  public String getStrAwayLineupGoalkeeper() {
    return strAwayLineupGoalkeeper;
  }
  public void setStrAwayLineupGoalkeeper(String strAwayLineupGoalkeeper) {
    this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
  }

  public String getStrAwayLineupDefense() {
    return strAwayLineupDefense;
  }
  public void setStrAwayLineupDefense(String strAwayLineupDefense) {
    this.strAwayLineupDefense = strAwayLineupDefense;
  }

  public String getStrAwayLineupMidfield() {
    return strAwayLineupMidfield;
  }
  public void setStrAwayLineupMidfield(String strAwayLineupMidfield) {
    this.strAwayLineupMidfield = strAwayLineupMidfield;
  }

  public String getStrAwayLineupForward() {
    return strAwayLineupForward;
  }
  public void setStrAwayLineupForward(String strAwayLineupForward) {
    this.strAwayLineupForward = strAwayLineupForward;
  }

  public String getStrAwayLineupSubstitutes() {
    return strAwayLineupSubstitutes;
  }
  public void setStrAwayLineupSubstitutes(String strAwayLineupSubstitutes) {
    this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
  }

  public String getStrAwayFormation() {
    return strAwayFormation;
  }
  public void setStrAwayFormation(String strAwayFormation) {
    this.strAwayFormation = strAwayFormation;
  }

  public Long getIntHomeShots() {
    return intHomeShots;
  }
  public void setIntHomeShots(Long intHomeShots) {
    this.intHomeShots = intHomeShots;
  }

  public Long getIntAwayShots() {
    return intAwayShots;
  }
  public void setIntAwayShots(Long intAwayShots) {
    this.intAwayShots = intAwayShots;
  }

  public String getStrTimestamp() {
    return strTimestamp;
  }
  public void setStrTimestamp(String strTimestamp) {
    this.strTimestamp = strTimestamp;
  }

  public String getDateEvent() {
    return dateEvent;
  }
  public void setDateEvent(String dateEvent) {
    this.dateEvent = dateEvent;
  }

  public String getDateEventLocal() {
    return dateEventLocal;
  }
  public void setDateEventLocal(String dateEventLocal) {
    this.dateEventLocal = dateEventLocal;
  }

  public String getStrTime() {
    return strTime;
  }
  public void setStrTime(String strTime) {
    this.strTime = strTime;
  }

  public String getStrTimeLocal() {
    return strTimeLocal;
  }
  public void setStrTimeLocal(String strTimeLocal) {
    this.strTimeLocal = strTimeLocal;
  }

  public String getStrTVStation() {
    return strTVStation;
  }
  public void setStrTVStation(String strTVStation) {
    this.strTVStation = strTVStation;
  }

  public Long getIdHomeTeam() {
    return idHomeTeam;
  }
  public void setIdHomeTeam(Long idHomeTeam) {
    this.idHomeTeam = idHomeTeam;
  }

  public Long getIdAwayTeam() {
    return idAwayTeam;
  }
  public void setIdAwayTeam(Long idAwayTeam) {
    this.idAwayTeam = idAwayTeam;
  }

  public String getStrResult() {
    return strResult;
  }
  public void setStrResult(String strResult) {
    this.strResult = strResult;
  }

  public String getStrVenue() {
    return strVenue;
  }
  public void setStrVenue(String strVenue) {
    this.strVenue = strVenue;
  }

  public String getStrCountry() {
    return strCountry;
  }
  public void setStrCountry(String strCountry) {
    this.strCountry = strCountry;
  }

  public String getStrCity() {
    return strCity;
  }
  public void setStrCity(String strCity) {
    this.strCity = strCity;
  }

  public String getStrPoster() {
    return strPoster;
  }
  public void setStrPoster(String strPoster) {
    this.strPoster = strPoster;
  }

  public String getStrSquare() {
    return strSquare;
  }
  public void setStrSquare(String strSquare) {
    this.strSquare = strSquare;
  }

  public String getStrFanart() {
    return strFanart;
  }
  public void setStrFanart(String strFanart) {
    this.strFanart = strFanart;
  }

  public String getStrThumb() {
    return strThumb;
  }
  public void setStrThumb(String strThumb) {
    this.strThumb = strThumb;
  }

  public String getStrBanner() {
    return strBanner;
  }
  public void setStrBanner(String strBanner) {
    this.strBanner = strBanner;
  }

  public String getStrMap() {
    return strMap;
  }
  public void setStrMap(String strMap) {
    this.strMap = strMap;
  }

  public String getStrTweet1() {
    return strTweet1;
  }
  public void setStrTweet1(String strTweet1) {
    this.strTweet1 = strTweet1;
  }

  public String getStrTweet2() {
    return strTweet2;
  }
  public void setStrTweet2(String strTweet2) {
    this.strTweet2 = strTweet2;
  }

  public String getStrTweet3() {
    return strTweet3;
  }
  public void setStrTweet3(String strTweet3) {
    this.strTweet3 = strTweet3;
  }

  public String getStrVideo() {
    return strVideo;
  }
  public void setStrVideo(String strVideo) {
    this.strVideo = strVideo;
  }

  public String getStrStatus() {
    return strStatus;
  }
  public void setStrStatus(String strStatus) {
    this.strStatus = strStatus;
  }

  public String getStrPostponed() {
    return strPostponed;
  }
  public void setStrPostponed(String strPostponed) {
    this.strPostponed = strPostponed;
  }

  public String getStrLocked() {
    return strLocked;
  }
  public void setStrLocked(String strLocked) {
    this.strLocked = strLocked;
  }
}
