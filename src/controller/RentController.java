package controller;

import interfaces.RentalSystemInterface;

public class RentController {
    public RentController(){
    }

    public String rentUnit(RentalSystemInterface rentInterface, String propertyID, String tenantID, String leaseInfo, String leaseStartDate,
                        String leaseEndDate, double rentAmount){
        return rentInterface.rentUnit(propertyID,tenantID,leaseInfo,leaseStartDate,
                leaseEndDate,rentAmount);
    }
}
