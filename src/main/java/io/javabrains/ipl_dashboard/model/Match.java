package io.javabrains.ipl_dashboard.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//@Table(name = "Match")
public class Match {
    @Id
    private long id;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
    private String eliminator;
    private String umpire1;
    private String umpire2;

    public Match() {
    }

    public Match(long id, String city, LocalDate date, String playerOfMatch, String venue, String team1, String team2, String tossWinner, String tossDecision, String matchWinner, String result, String resultMargin, String eliminator, String umpire1, String umpire2) {
        this.id = id;
        this.city = city;
        this.date = date;
        this.playerOfMatch = playerOfMatch;
        this.venue = venue;
        this.team1 = team1;
        this.team2 = team2;
        this.tossWinner = tossWinner;
        this.tossDecision = tossDecision;
        this.matchWinner = matchWinner;
        this.result = result;
        this.resultMargin = resultMargin;
        this.eliminator = eliminator;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
    }
}
