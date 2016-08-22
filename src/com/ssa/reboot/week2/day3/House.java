package com.ssa.reboot.week2.day3;

public class House extends Building {
	
	public String kindOfHouse = null;
	public int zipcode = 0;
	public int sizeOfHouse = 0;
	public int numberOfBedrooms = 0;
	public int numberOfBathrooms = 0;
	public String typeOfFlooringForBedrooms = null;
	public String typeOfFlooringForBathrooms = null;
	public String typeOfFlooringForLivingroom = null;
	public String typeOfEnergyForStove = null;
	public String colorOfKitchenAppliances = null;
	
	public House(String kindOfHouse, int zipcode, int sizeOfHouse, int numberOfBedrooms, int numberOfBathrooms,
			String typeOfFlooringForBedrooms, String typeOfFlooringForBathrooms, String typeOfFlooringForLivingroom,
			String typeOfEnergyForStove, String colorOfKitchenAppliances) {
		this.kindOfHouse = kindOfHouse;
		this.zipcode = zipcode;
		this.sizeOfHouse = sizeOfHouse;
		this.numberOfBedrooms = numberOfBedrooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.typeOfFlooringForBedrooms = typeOfFlooringForBedrooms;
		this.typeOfFlooringForBathrooms = typeOfFlooringForBathrooms;
		this.typeOfFlooringForLivingroom = typeOfFlooringForLivingroom;
		this.typeOfEnergyForStove = typeOfEnergyForStove;
		this.colorOfKitchenAppliances = colorOfKitchenAppliances;
	}

	public House() {
	}

	public String getKindOfHouse() {
		return kindOfHouse;
	}

	public void setKindOfHouse(String kindOfHouse) {
		this.kindOfHouse = kindOfHouse;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getSizeOfHouse() {
		return sizeOfHouse;
	}

	public void setSizeOfHouse(int sizeOfHouse) {
		this.sizeOfHouse = sizeOfHouse;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public String getTypeOfFlooringForBedrooms() {
		return typeOfFlooringForBedrooms;
	}

	public void setTypeOfFlooringForBedrooms(String typeOfFlooringForBedrooms) {
		this.typeOfFlooringForBedrooms = typeOfFlooringForBedrooms;
	}

	public String getTypeOfFlooringForBathrooms() {
		return typeOfFlooringForBathrooms;
	}

	public void setTypeOfFlooringForBathrooms(String typeOfFlooringForBathrooms) {
		this.typeOfFlooringForBathrooms = typeOfFlooringForBathrooms;
	}

	public String getTypeOfFlooringForLivingroom() {
		return typeOfFlooringForLivingroom;
	}

	public void setTypeOfFlooringForLivingroom(String typeOfFlooringForLivingroom) {
		this.typeOfFlooringForLivingroom = typeOfFlooringForLivingroom;
	}

	public String getTypeOfEnergyForStove() {
		return typeOfEnergyForStove;
	}

	public void setTypeOfEnergyForStove(String typeOfEnergyForStove) {
		this.typeOfEnergyForStove = typeOfEnergyForStove;
	}

	public String getColorOfKitchenAppliances() {
		return colorOfKitchenAppliances;
	}

	public void setColorOfKitchenAppliances(String colorOfKitchenAppliances) {
		this.colorOfKitchenAppliances = colorOfKitchenAppliances;
	}

	@Override
	public String toString() {
		return "So you want a " + kindOfHouse + ", in zipcode " + zipcode + 
				" with a size of " + sizeOfHouse + " square feet.\nAlso you want the house to have "
				+ numberOfBedrooms + " bedrooms and " + numberOfBathrooms + " bathrooms with " 
				+ typeOfFlooringForBedrooms + " flooring in the bedrooms,\n" 
				+ typeOfFlooringForBathrooms + " flooring in the bathrooms and " 
				+ typeOfFlooringForLivingroom + " flooring in the living room."
				+ "\nYou also wanted a/an " + typeOfEnergyForStove + " stove with "
				+ colorOfKitchenAppliances + " kitchen appliances.";
	}

	@Override
	public void doorsLocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doorsOpen() {
		System.out.println("It's been fantastic working with you! Now the doors to your new home are open!!");		
	}
	
}
