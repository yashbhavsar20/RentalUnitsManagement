package Model.Property.ConcreteProperty;

import Model.Property.Property;

public class Condo extends Property{
	private int unitNumber;

	public Condo(int streetNumber, String streetName, String cityName,
				 String postalCode,int apartmentNumber){
		this.streetNumber=streetNumber;
		this.streetName=streetName;
		this.cityName=cityName;
		this.postalCode=postalCode;
		this.unitNumber=apartmentNumber;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	@Override
	public String addProperty() {
		// TODO Auto-generated method stub
		return "Condo";
	}

}
