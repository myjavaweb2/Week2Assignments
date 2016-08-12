package com.ssa.reboot.week2.day4;

public abstract class Player {
	
	protected String name = null;
	protected String gender = null;
	protected int scoreCount = 0;
	
	public Player(String name, String gender, int scoreCount) {
		this.name = name;
		this.gender = gender;
		this.scoreCount = scoreCount;
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScoreCount() {
		return scoreCount;
	}

	public void setScoreCount(int scoreCount) {
		this.scoreCount = scoreCount;
	}
	
	public abstract String playerThrows();
	
	public abstract void playerWins();

}
