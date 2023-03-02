package model.factory;

import model.address.Address;
import model.property.Property;
import model.property.concrete_property.ApartmentBuilding;
import model.property.concrete_property.Condo;
import model.property.concrete_property.House;
import model.property.property_details.PropertyDetails;

public class PropertyFactory {
	
	public Property addProperty(String propertyType,int streetNumber, String streetName, String cityName,
								String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
								int numberOfBathRooms, double squareFoot, String province) {

		if (propertyType.equals("APARTMENT")) {
			return new ApartmentBuilding(new Address(postalCode,cityName,province),
					civicAddress);

		}
		else if (propertyType.equals("CONDO")) {
			return new Condo(new Address(postalCode,cityName,province),streetName, streetNumber,
					apartmentNumber,new PropertyDetails(squareFoot, numberOfBedRooms,numberOfBathRooms));
		}
		else if(propertyType.equals("HOUSE")) {
			return new House(new Address(postalCode,province,cityName), streetName, streetNumber,
					new PropertyDetails(squareFoot, numberOfBedRooms,numberOfBathRooms));
		}
		else {
			return null;
		}
	}
}
