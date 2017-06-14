package com.example.demo;

<<<<<<< HEAD
import java.util.Date;

public class TournamentMatch extends Match {
	private int homePoints;
	private int visitorPoints;
	public TournamentMatch(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam, int homePoints, int visitorPoints) {
		super(matchKey, date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);
		this.homePoints = homePoints;
		this.visitorPoints = visitorPoints;
	}
=======
public class TournamentMatch extends Match {
	private int homePoints;
	private int visitorPoints;
>>>>>>> branch 'master' of https://github.com/pipisun/springbootexercise.git

}
