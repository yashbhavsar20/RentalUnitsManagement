package Model.Factory;

import Model.Property.Property;
import Model.Property.ConcreteProperty.Apartment;
import Model.Property.ConcreteProperty.Condo;
import Model.Property.ConcreteProperty.House;

public class PropertyFactory {
	
	public Property addProperty(String propertyType,int streetNumber, String streetName, String cityName,
								String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
								int numberOfBathRooms, double squareFoot) {

		if (propertyType.equals("APARTMENT")) {
			return new Apartment(streetNumber, streetName, cityName,
					postalCode,civicAddress,apartmentNumber, numberOfBedRooms,
			numberOfBathRooms, squareFoot);

		}
		else if (propertyType.equals("CONDO")) {
			return new Condo(streetNumber, streetName, cityName,
					postalCode,apartmentNumber);
		}
		else if(propertyType.equals("HOUSE")) {
			return new House(streetNumber, streetName, cityName,
					postalCode);
		}
		else {
			return null;
		}
	}
}
