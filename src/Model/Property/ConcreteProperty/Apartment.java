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

	@Override
	public String getProperty() {
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
