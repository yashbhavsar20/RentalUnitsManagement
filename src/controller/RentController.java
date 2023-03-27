package controller;

import interfaces.RentalSystemInterface;
import model.property.Property;

import java.util.ArrayList;

public class RentController {
    public RentController(){
    }

    public String rentUnit(RentalSystemInterface rentInterface, String propertyID, String tenantID, String leaseInfo, String leaseStartDate,
                        String leaseEndDate, double rentAmount){
        return rentInterface.rentUnit(propertyID,tenantID,leaseInfo,leaseStartDate,
                leaseEndDate,rentAmount);
    }

    public ArrayList<Property> displayRentedUnit(RentalSystemInterface rentalInterface){
        return rentalInterface.displayRentedUnit();
    }

    public ArrayList<Property> displayVacantUnit(RentalSystemInterface rentalInterface){
        return rentalInterface.displayVacantUnit();
    }
}
