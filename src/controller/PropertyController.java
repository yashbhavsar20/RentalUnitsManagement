package controller;
import interfaces.RentalSystemInterface;
import model.property.Property;
import model.request_model.ApartmentRequest;

import java.util.ArrayList;

public class PropertyController {
    public PropertyController(){

    }

    public String addProperty(RentalSystemInterface rentalInterface, String propertyID, String propertyType, String postalCode, String cityName,
                                 String province, String civicAddress, String streetName, int streetNumber,
                                 int apartmentNumber, double squareFoot, int numberOfBedRooms,
                                 int numberOfBathRooms, ArrayList<ApartmentRequest> apartmentList){
        return rentalInterface.addProperty(propertyID, propertyType, postalCode, cityName,
                    province, civicAddress,streetName,streetNumber, apartmentNumber,squareFoot,
                    numberOfBedRooms, numberOfBathRooms,apartmentList);
    }
    public ArrayList<Property> displayProperty(RentalSystemInterface rentalInterface){
        return rentalInterface.displayProperty();
    }

    public String makePropertyAvailable(RentalSystemInterface rentalInterface, String propertyID) {
        return rentalInterface.makePropertyAvailable(propertyID);
    }
}
