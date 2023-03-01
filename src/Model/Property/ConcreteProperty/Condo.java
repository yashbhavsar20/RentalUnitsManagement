package Model.Property.ConcreteProperty;

import Model.Property.Property;

public class Condo extends Property{
	private String propertyType="CONDO";
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

	public String getPropertyType() {
		return propertyType;
	}

	@Override
	public String addProperty() {
		// TODO Auto-generated method stub
		return "Condo";
	}

	@Override
	public String toString() {
		return "Condo{" +
				"propertyType='" + propertyType + '\'' +
				", unitNumber=" + unitNumber +
				", streetNumber=" + streetNumber +
				", streetName='" + streetName + '\'' +
				", cityName='" + cityName + '\'' +
				", postalCode='" + postalCode + '\'' +
				'}';
	}
}
