package com.aurionpro.model;

public class BookCricket {
	public static int round;
	private String name;
	private int point;
	private int score;
	private int turns;
	
	public BookCricket(){
		this.name = "PlayerName";
		this.point = 0;
		this.score = 0;
		this.turns = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTurns() {
		return turns;
	}

	public void setTurns(int turns) {
		this.turns = turns;
	}

	public int getRound() {
		return round;
	}
	
}
