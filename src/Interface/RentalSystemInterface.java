package Interface;

import Model.Property.Property;
import Model.Tenant.Tenant;

import java.util.ArrayList;

public interface RentalSystemInterface {
		void addProperty(String type,int streetNumber, String streetName, String cityName,
						 String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
						 int numberOfBathRooms, double squareFoot);

		void addTenant(String tenantName,long sin);
		
		void rentUnit(Property property, Tenant tenant);
		
		ArrayList<Property> displayProperty();
		
		void displayTenant();
		
		void displayRentedUnit();
		
		void displayVacantUnit();
		
		void displayLeases();
		
		void displayRentPaidStatus();
		
}
