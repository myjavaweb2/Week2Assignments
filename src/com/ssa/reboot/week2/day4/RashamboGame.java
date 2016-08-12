//Author - Kamaldeen Alabi
//For Week 2 Rock, Paper, Scissor Assignment
//August 12, 2016

package com.ssa.reboot.week2.day4;

import java.util.Scanner;

public class RashamboGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userName = null;
		String userOpponentSelected = null;
		String userThrows = null;
		String opponentPlayerThrows = null;
		String userResponse = null;
		User userA = new User();
		OpponentHillary hillary = new OpponentHillary();
		OpponentObama obama = new OpponentObama();
		OpponentTrump trump = new OpponentTrump();
	
		boolean opponentIsValid = false;
		boolean continuePlay = false;
		
		System.out.println("Please enter your name: ");
		String playerName = sc.nextLine();
		
		userA.setName(playerName);
		
		userName = userA.getName();
		
		do {
		
		do {
			System.out.println("Hi " + userName + ", please select an opponent to play against "
					+ "- Hillary, Obama or Trump");
			userOpponentSelected = sc.nextLine();
			
			switch (userOpponentSelected.toLowerCase()) {
			case "hillary":
				opponentIsValid = false;
				System.out.println("You have selected Hillary as your opponent player!");
				break;
			case "obama":
				opponentIsValid = false;
				System.out.println("You have selected Obama as your opponent player!");
				break;
			case "trump":
				opponentIsValid = false;
				System.out.println("You have selected Trump as your opponent player!");
				break;

			default:
				opponentIsValid = true;
				break;
			}
		} while (opponentIsValid);
		
			if (userOpponentSelected.equalsIgnoreCase("Hillary")) {
				
			do {
				System.out.println("Now what would you like to throw - Rock, Paper or Scissor?");
				userThrows = sc.nextLine().toLowerCase();
			
				switch (userThrows.toLowerCase()) {
				case "rock":
					opponentIsValid = false;
					break;
				case "paper":
					opponentIsValid = false;
					break;
				case "scissor":
					opponentIsValid = false;
					break;

				default:
					opponentIsValid = true;
					break;
				}
			} while (opponentIsValid);
				
				opponentPlayerThrows = hillary.playerThrows();
				System.out.println("You threw " + userThrows + " and Hillary threw " + opponentPlayerThrows + " !");
			} else if (userOpponentSelected.equalsIgnoreCase("Obama")) {
				
			do {
				System.out.println("Now what would you like to throw - Rock, Paper or Scissor?");
				userThrows = sc.nextLine().toLowerCase();
				
				switch (userThrows.toLowerCase()) {
				case "rock":
					opponentIsValid = false;
					break;
				case "paper":
					opponentIsValid = false;
					break;
				case "scissor":
					opponentIsValid = false;
					break;

				default:
					opponentIsValid = true;
					break;
				}
			} while (opponentIsValid);
				
				opponentPlayerThrows = obama.playerThrows();
				System.out.println("You threw " + userThrows + " and Obama threw " + opponentPlayerThrows + " !");
			} else if (userOpponentSelected.equalsIgnoreCase("Trump")) {
				
			do {
				System.out.println("Now what would you like to throw - Rock, Paper or Scissor?");
				userThrows = sc.nextLine().toLowerCase();
				
				switch (userThrows.toLowerCase()) {
				case "rock":
					opponentIsValid = false;
					break;
				case "paper":
					opponentIsValid = false;
					break;
				case "scissor":
					opponentIsValid = false;
					break;

				default:
					opponentIsValid = true;
					break;
				}
			} while (opponentIsValid);
				
				opponentPlayerThrows = trump.playerThrows();
				System.out.println("You threw " + userThrows + " and Trump threw " + opponentPlayerThrows + " !");
			}
			if (userThrows.equalsIgnoreCase("rock") && opponentPlayerThrows.equalsIgnoreCase("rock")) {
				System.out.println("You're both tied! Try again!!");

			} else if (userThrows.equalsIgnoreCase("rock") && opponentPlayerThrows.equalsIgnoreCase("paper")) {
				System.out.println("Oh, You lose!");

			} else if (userThrows.equalsIgnoreCase("rock") && opponentPlayerThrows.equalsIgnoreCase("scissor")) {
				System.out.println("Great job " + userName + "! You won!!");

			} else if (userThrows.equalsIgnoreCase("paper") && opponentPlayerThrows.equalsIgnoreCase("rock")) {
				System.out.println("Great job " + userName + "! You won!!");

			} else if (userThrows.equalsIgnoreCase("paper") && opponentPlayerThrows.equalsIgnoreCase("paper")) {
				System.out.println("You're both tied! Try again!!");

			} else if (userThrows.equalsIgnoreCase("paper") && opponentPlayerThrows.equalsIgnoreCase("scissor")) {
				System.out.println("Oh, You lose!");

			} else if (userThrows.equalsIgnoreCase("scissor") && opponentPlayerThrows.equalsIgnoreCase("rock")) {
				System.out.println("Oh, You lose!");

			} else if (userThrows.equalsIgnoreCase("scissor") && opponentPlayerThrows.equalsIgnoreCase("paper")) {
				System.out.println("Great job " + userName + "! You won!!");

			} else if (userThrows.equalsIgnoreCase("scissor") && opponentPlayerThrows.equalsIgnoreCase("scissor")) {
				System.out.println("You're both tied! Try again!!");

			} 
			
			System.out.println("Ok " + userName + ", do you want to play again? y/n");
			userResponse = sc.nextLine().toLowerCase();
			
			if (userResponse.equalsIgnoreCase("y")) {
				continuePlay = true;
				
			} else if (userResponse.equalsIgnoreCase("n")) {
				continuePlay = false;
			}
			
		} while (continuePlay);

	}//main
	
}
