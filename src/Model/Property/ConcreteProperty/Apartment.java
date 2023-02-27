package Model.Property.ConcreteProperty;

import Model.Property.Property;

public class Apartment extends Property{
	private String civicAddress;
	private int apartmentNumber;
	private int numberOfBedRooms;
	private int numberOfBathRooms;
	private double squareFoot;
	
	
	@Override
	public String getProperty() {
		// TODO Auto-generated method stub
		return "Apartment";
	}
	
}
