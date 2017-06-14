package com.example.demo.Entity;

import java.util.List;

public class Team {
	private int teamKey;
	private String name;
	private String city;
	private String mascot;
	private String players;
	private String homeUniform;
	private String visitUniform;
	private List<Match> matchesAsHome;
	private List<Match> matchesAsVisitor;
}
