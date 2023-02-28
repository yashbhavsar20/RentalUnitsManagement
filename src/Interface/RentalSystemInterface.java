package Interface;

public interface RentalSystemInterface {
		void addProperty(String type,int streetNumber, String streetName, String cityName,
						 String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
						 int numberOfBathRooms, double squareFoot);

		void addTenant(String tenantName);
		
		void rentUnit();
		
		String displayProperty();
		
		void displayTenant();
		
		void displayRentedUnit();
		
		void displayVacantUnit();
		
		void displayLeases();
		
		void displayRentPaidStatus();
		
}
