//Author - Kamaldeen Alabi
//For Week 2 Object Design Assignment
//August 10, 2016

package com.ssa.reboot.week2.day3;

import java.util.Scanner;

public class ListingAgency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInputKindOfHouse = null;
		String userInputString = null;
		String userInputNumber = null;
		int houseNumbers = 0;
		boolean userInputFailed = false;
		
		House ourDreamHome = new House();
		
		System.out.println("Welcome to the #1 For House Sales Listing site!");
		System.out.println("What kind of house are you looking to purchase?");
		userInputKindOfHouse = sc.nextLine();
		
		ourDreamHome.setKindOfHouse(userInputKindOfHouse);
		
		do {
			System.out.println("What zipcode would you like the house to be in?");
			userInputNumber = sc.nextLine();
			
			userInputFailed = numberIsValid(userInputNumber);
			
		} while (userInputFailed);
		
		houseNumbers = Integer.parseInt(userInputNumber);
		
		ourDreamHome.setZipcode(houseNumbers);
		
		do {
			System.out.println("What is the size in square feet would you like?");
			userInputNumber = sc.nextLine();
			
			userInputFailed = numberIsValid(userInputNumber);
			
		} while (userInputFailed);
		
		houseNumbers = Integer.parseInt(userInputNumber);
		
		ourDreamHome.setSizeOfHouse(houseNumbers);
		
		do {
			System.out.println("How many bedrooms would you like the house to have?");
			userInputNumber = sc.nextLine();
			
			userInputFailed = numberIsValid(userInputNumber);
			
		} while (userInputFailed);
		
		houseNumbers = Integer.parseInt(userInputNumber);
		
		ourDreamHome.setNumberOfBedrooms(houseNumbers);
		
		do {
			System.out.println("How many bathrooms would you like the house to have?");
			userInputNumber = sc.nextLine();
			
			userInputFailed = numberIsValid(userInputNumber);
			
		} while (userInputFailed);
		
		houseNumbers = Integer.parseInt(userInputNumber);
		
		ourDreamHome.setNumberOfBathrooms(houseNumbers);
		
		System.out.println("What type of flooring for the bedrooms would you like?");
		userInputString = sc.nextLine();
		
		ourDreamHome.setTypeOfFlooringForBedrooms(userInputString);
		
		System.out.println("What type of flooring for the bathrooms would you like?");
		userInputString = sc.nextLine();
		
		ourDreamHome.setTypeOfFlooringForBathrooms(userInputString);
		
		System.out.println("What type of flooring for the living room would you like?");
		userInputString = sc.nextLine();
		
		ourDreamHome.setTypeOfFlooringForLivingroom (userInputString);
		
		System.out.println("What type of energy for the kitchen stove would you like?");
		userInputString = sc.nextLine();
		
		ourDreamHome.setTypeOfEnergyForStove (userInputString);
		
		System.out.println("What color would you like for the kitchen appliances?");
		userInputString = sc.nextLine();
		
		ourDreamHome.setColorOfKitchenAppliances (userInputString);
		
		System.out.println(ourDreamHome.toString());
		System.out.println();
		System.out.println("That's great! Because we actually have that kind of " 
				+ userInputKindOfHouse + " available for sale right now!!");
		System.out.println();
		
		ourDreamHome.doorsOpen();

	}//main

	private static boolean numberIsValid(String userInputNumber) {
		
		try {
			int anyNumber = Integer.parseInt(userInputNumber);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}

}//class
