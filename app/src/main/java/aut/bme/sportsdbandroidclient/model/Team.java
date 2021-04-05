package aut.bme.sportsdbandroidclient.model;

import java.util.Date;

public class Team {
    private Integer idStanding;
    private Integer intRank;
    private Integer idTeam;
    private String strTeam;
    private String strTeamBadge;

    public Integer getIdStanding() {
        return idStanding;
    }

    public void setIdStanding(Integer idStanding) {
        this.idStanding = idStanding;
    }

    public Integer getIntRank() {
        return intRank;
    }

    public void setIntRank(Integer intRank) {
        this.intRank = intRank;
    }

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
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

    public Integer getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(Integer idLeague) {
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

    public Integer getIntPlayed() {
        return intPlayed;
    }

    public void setIntPlayed(Integer intPlayed) {
        this.intPlayed = intPlayed;
    }

    public Integer getIntWin() {
        return intWin;
    }

    public void setIntWin(Integer intWin) {
        this.intWin = intWin;
    }

    public Integer getIntLoss() {
        return intLoss;
    }

    public void setIntLoss(Integer intLoss) {
        this.intLoss = intLoss;
    }

    public Integer getIntDraw() {
        return intDraw;
    }

    public void setIntDraw(Integer intDraw) {
        this.intDraw = intDraw;
    }

    public Integer getIntGoalsFor() {
        return intGoalsFor;
    }

    public void setIntGoalsFor(Integer intGoalsFor) {
        this.intGoalsFor = intGoalsFor;
    }

    public Integer getIntGoalsAgainst() {
        return intGoalsAgainst;
    }

    public void setIntGoalsAgainst(Integer intGoalsAgainst) {
        this.intGoalsAgainst = intGoalsAgainst;
    }

    public Integer getIntGoalDifference() {
        return intGoalDifference;
    }

    public void setIntGoalDifference(Integer intGoalDifference) {
        this.intGoalDifference = intGoalDifference;
    }

    public Integer getIntPoints() {
        return intPoints;
    }

    public void setIntPoints(Integer intPoints) {
        this.intPoints = intPoints;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    private Integer idLeague;
    private String strLeague;
    private String strSeason;
    private String strForm;
    private String strDescription;
    private Integer intPlayed;
    private Integer intWin;
    private Integer intLoss;
    private Integer intDraw;
    private Integer intGoalsFor;
    private Integer intGoalsAgainst;
    private Integer intGoalDifference;
    private Integer intPoints;
    private Date dateUpdated;
}
