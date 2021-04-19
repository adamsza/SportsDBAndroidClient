package aut.bme.sportsdbandroidclient.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "favourite_team")
public class FavouriteTeam {
    @ColumnInfo(name="standing")
    private Long idStanding;
    @ColumnInfo(name="rank")
    private Long intRank;
    @PrimaryKey
    private Long idTeam;
    @ColumnInfo(name="team")
    private String strTeam;
    @ColumnInfo(name="team_badge")
    private String strTeamBadge;
    @ColumnInfo(name="league_id")
    private Long idLeague;
    @ColumnInfo(name="league")
    private String strLeague;
    @ColumnInfo(name="season")
    private String strSeason;
    @ColumnInfo(name="form")
    private String strForm;
    @ColumnInfo(name="description")
    private String strDescription;
    @ColumnInfo(name="played")
    private Long intPlayed;
    @ColumnInfo(name="win")
    private Long intWin;
    @ColumnInfo(name="loss")
    private Long intLoss;
    @ColumnInfo(name="draw")
    private Long intDraw;
    @ColumnInfo(name="goals_for")
    private Long intGoalsFor;
    @ColumnInfo(name="goals_against")
    private Long intGoalsAgainst;
    @ColumnInfo(name="goal_difference")
    private Long intGoalDifference;
    @ColumnInfo(name="points")
    private Long intPoints;
    @ColumnInfo(name="updated_date")
    private String dateUpdated;

    public FavouriteTeam(Long idStanding, Long intRank, Long idTeam, String strTeam, String strTeamBadge, Long idLeague, String strLeague, String strSeason, String strForm, String strDescription, Long intPlayed, Long intWin, Long intLoss, Long intDraw, Long intGoalsFor, Long intGoalsAgainst, Long intGoalDifference, Long intPoints, String dateUpdated) {
        this.idStanding = idStanding;
        this.intRank = intRank;
        this.idTeam = idTeam;
        this.strTeam = strTeam;
        this.strTeamBadge = strTeamBadge;
        this.idLeague = idLeague;
        this.strLeague = strLeague;
        this.strSeason = strSeason;
        this.strForm = strForm;
        this.strDescription = strDescription;
        this.intPlayed = intPlayed;
        this.intWin = intWin;
        this.intLoss = intLoss;
        this.intDraw = intDraw;
        this.intGoalsFor = intGoalsFor;
        this.intGoalsAgainst = intGoalsAgainst;
        this.intGoalDifference = intGoalDifference;
        this.intPoints = intPoints;
        this.dateUpdated = dateUpdated;
    }

    public Long getIdStanding() {
        return idStanding;
    }

    public Long getIntRank() {
        return intRank;
    }

    public Long getIdTeam() {
        return idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public Long getIdLeague() {
        return idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public String getStrSeason() {
        return strSeason;
    }

    public String getStrForm() {
        return strForm;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public Long getIntPlayed() {
        return intPlayed;
    }

    public Long getIntWin() {
        return intWin;
    }

    public Long getIntLoss() {
        return intLoss;
    }

    public Long getIntDraw() {
        return intDraw;
    }

    public Long getIntGoalsFor() {
        return intGoalsFor;
    }

    public Long getIntGoalsAgainst() {
        return intGoalsAgainst;
    }

    public Long getIntGoalDifference() {
        return intGoalDifference;
    }

    public Long getIntPoints() {
        return intPoints;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }
}
