package com.example.demo;

import java.util.Date;

public class FriendlyMatch extends Match {
	private AwardType award;

	public FriendlyMatch(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam, AwardType award) {
		super(matchKey, date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);
		this.award = award;
	}
	
}
