package rental_interface;

import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;

public interface RentalSystemInterface {
		String addProperty(String propertyType,String postalCode, String cityName,
						 String province, String civicAddress,String streetName,int streetNumber,
						 int apartmentNumber,double squareFoot, int numberOfBedRooms,
						 int numberOfBathRooms);

		String addTenant(String tenantName,int age, String email);
		
		void rentUnit(Property property, Tenant tenant);
		
		ArrayList<Property> displayProperty();
		
		void displayTenant();
		
		void displayRentedUnit();
		
		void displayVacantUnit();
		
		void displayLeases();
		
		void displayRentPaidStatus(boolean rentPaid);
		
}
