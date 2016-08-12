package com.ssa.reboot.week2.day4;

public class OpponentObama extends Opponent {

	public OpponentObama(String name, String gender, int scoreCount, String opponentThrows) {
		super(name, gender, scoreCount, opponentThrows);
		// TODO Auto-generated constructor stub
	}
	
	public OpponentObama() {
	}
	
	@Override
	public String playerThrows() {
		
//		int opponentRandomPick = (int) ((Math.random() * 3) + 1);
//		System.out.println(opponentRandomPick);		
//		
//		if (opponentRandomPick == 1) {
//			opponentThrows = "Rock";
//			
//		} else if (opponentRandomPick == 2) {
//			opponentThrows = "Paper";
//
//		}
//		else if (opponentRandomPick == 3) {
//			opponentThrows = "Scissor";
//		}
		
		opponentThrows = "paper";
//		System.out.println(opponentThrows);
		return opponentThrows;
	}

	@Override
	public void playerWins() {
		// TODO Auto-generated method stub
		
	}

	

}
