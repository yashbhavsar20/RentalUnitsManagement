package rental_interface;

import model.property.Property;
import model.request_model.ApartmentRequest;
import model.tenant.Tenant;

import java.util.ArrayList;

public interface RentalSystemInterface {
		String addProperty(String propertyID,String propertyType, String postalCode, String cityName,
						   String province, String civicAddress, String streetName, int streetNumber,
						   int apartmentNumber, double squareFoot, int numberOfBedRooms,
						   int numberOfBathRooms, ArrayList<ApartmentRequest> apartmentList);

		String addTenant(String tenantName,int age, String email);
		
		String rentUnit(String propertyID, String tenantID);
		
		ArrayList<Property> displayProperty();
		
		ArrayList<Tenant> displayTenant();
		
		void displayRentedUnit();
		
		void displayVacantUnit();
		
		void displayLeases();

		ArrayList<Tenant> displayRentPaidStatus(boolean rentPaid);
		
}
