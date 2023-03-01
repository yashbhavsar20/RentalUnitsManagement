package model.property.concrete_property;

import model.property.Property;
public class House extends Property{
	private String propertyType="HOUSE";
	public House(int streetNumber, String streetName, String cityName,
				 String postalCode){
		this.streetNumber=streetNumber;
		this.streetName=streetName;
		this.cityName=cityName;
		this.postalCode=postalCode;
	}

	public String getPropertyType() {
		return propertyType;
	}

	@Override
	public String toString() {
		return "House{" +
				"propertyType='" + propertyType + '\'' +
				", streetNumber=" + streetNumber +
				", streetName='" + streetName + '\'' +
				", cityName='" + cityName + '\'' +
				", postalCode='" + postalCode + '\'' +
				'}';
	}

	@Override
	public String addProperty() {
		// TODO Auto-generated method stub
		return "House";
	}
	
}
