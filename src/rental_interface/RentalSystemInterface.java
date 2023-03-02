package rental_interface;

import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;

public interface RentalSystemInterface {
		void addProperty(String type,int streetNumber, String streetName, String cityName,
						 String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
						 int numberOfBathRooms, double squareFoot);

		String addTenant(String tenantName,int age, String email);
		
		void rentUnit(Property property, Tenant tenant);
		
		ArrayList<Property> displayProperty();
		
		void displayTenant();
		
		void displayRentedUnit();
		
		void displayVacantUnit();
		
		void displayLeases();
		
		void displayRentPaidStatus();
		
}
