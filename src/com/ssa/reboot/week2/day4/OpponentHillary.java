package com.ssa.reboot.week2.day4;

public class OpponentHillary extends Opponent {

	public OpponentHillary(String name, String gender, int scoreCount, String opponentThrows) {
		super(name, gender, scoreCount, opponentThrows);
		// TODO Auto-generated constructor stub
	}
	
	public OpponentHillary() {
	}

	@Override
	public String playerThrows() {
		
		int opponentRandomPick = (int) ((Math.random() * 3) + 1);
//		System.out.println(opponentRandomPick);		
		
		if (opponentRandomPick == 1) {
			opponentThrows = "rock";
			
		} else if (opponentRandomPick == 2) {
			opponentThrows = "paper";

		}
		else if (opponentRandomPick == 3) {
			opponentThrows = "scissor";
		}
//		System.out.println(opponentThrows);
		return opponentThrows;
	}

	@Override
	public void playerWins() {
		// TODO Auto-generated method stub
		
	}
	
}
