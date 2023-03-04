package model.factory;

import model.address.Address;
import model.property.Property;
import model.property.concrete_property.ApartmentBuilding;
import model.property.concrete_property.Condo;
import model.property.concrete_property.House;
import model.property.property_details.PropertyDetails;
import model.request_model.ApartmentRequest;

import java.util.ArrayList;

public class PropertyFactory {
	
	public Property addConcreteProperty(String propertyID,String propertyType, String postalCode, String cityName,
										String province, String civicAddress, String streetName, int streetNumber,
										int apartmentNumber, double squareFoot, int numberOfBedRooms,
										int numberOfBathRooms, ArrayList<ApartmentRequest> apartmentList) {

		if (propertyType.equals("APARTMENT")) {
			return new ApartmentBuilding(new Address(postalCode,cityName,province),
					civicAddress, apartmentList);

		}
		else if (propertyType.equals("CONDO")) {
			return new Condo(new Address(postalCode,cityName,province),streetName,streetNumber,
					apartmentNumber,new PropertyDetails(propertyID,squareFoot,numberOfBedRooms,
					numberOfBathRooms));
		}
		else if(propertyType.equals("HOUSE")) {
			return new House(new Address(postalCode,province,cityName), streetName, streetNumber,
					new PropertyDetails(propertyID,squareFoot, numberOfBedRooms,numberOfBathRooms));
		}
		else {
			return null;
		}
	}
}
