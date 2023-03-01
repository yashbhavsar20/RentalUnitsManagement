package Model.Property.ConcreteProperty;

import Model.Property.Property;

public class Apartment extends Property{
	private String civicAddress;
	private int apartmentNumber;
	private int numberOfBedRooms;
	private int numberOfBathRooms;
	private double squareFoot;
	
	public Apartment(int streetNumber, String streetName, String cityName,
					 String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
					int numberOfBathRooms, double squareFoot){
		this.streetNumber=streetNumber;
		this.streetName=streetName;
		this.cityName=cityName;
		this.postalCode=postalCode;
		this.civicAddress=civicAddress;
		this.apartmentNumber=apartmentNumber;
		this.numberOfBedRooms=numberOfBedRooms;
		this.numberOfBathRooms=numberOfBathRooms;
		this.squareFoot=squareFoot;
	}

	public String getCivicAddress() {
		return civicAddress;
	}

	public void setCivicAddress(String civicAddress) {
		this.civicAddress = civicAddress;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}

	public void setNumberOfBedRooms(int numberOfBedRooms) {
		this.numberOfBedRooms = numberOfBedRooms;
	}

	public int getNumberOfBathRooms() {
		return numberOfBathRooms;
	}

	public void setNumberOfBathRooms(int numberOfBathRooms) {
		this.numberOfBathRooms = numberOfBathRooms;
	}

	public double getSquareFoot() {
		return squareFoot;
	}

	public void setSquareFoot(double squareFoot) {
		this.squareFoot = squareFoot;
	}

	@Override
	public String addProperty() {
		// TODO Auto-generated method stub
		return "Apartment";
	}

	@Override
	public String toString() {
		return "Apartment{" +
				"civicAddress='" + civicAddress + '\'' +
				", apartmentNumber=" + apartmentNumber +
				", numberOfBedRooms=" + numberOfBedRooms +
				", numberOfBathRooms=" + numberOfBathRooms +
				", squareFoot=" + squareFoot +
				", streetNumber=" + streetNumber +
				", streetName='" + streetName + '\'' +
				", cityName='" + cityName + '\'' +
				", postalCode='" + postalCode + '\'' +
				'}';
	}
}
