package com.ssa.reboot.week2.day4;

public class User extends Player {
	
	protected String userThrows = null;
	protected String userOpponentSelected = null;
	
	public User(String name, String gender, int scoreCount, String userThrows, String userOpponentSelected) {
		super(name, gender, scoreCount);
		this.userThrows = userThrows;
		this.userOpponentSelected = userOpponentSelected;
	}
	
	public User() {
	}

	public String getUserThrows() {
		return userThrows;
	}

	public void setUserThrows(String userThrows) {
		this.userThrows = userThrows;
	}

	public String getUserOpponentSelected() {
		return userOpponentSelected;
	}

	public void setUserOpponentSelected(String userOpponentSelected) {
		this.userOpponentSelected = userOpponentSelected;
	}
	
	@Override
	public String playerThrows() {
		return userThrows;
		// TODO Auto-generated method stub

	}

	@Override
	public void playerWins() {
		// TODO Auto-generated method stub

	}

}
