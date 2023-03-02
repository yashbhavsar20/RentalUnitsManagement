package service;

import rental_interface.RentalSystemInterface;
import model.factory.PropertyFactory;
import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;

public class RentalServices implements RentalSystemInterface {
        ArrayList<Property> propertyList=new ArrayList<>();
        public void addProperty(String propertyType,String postalCode, String cityName,
                                String province, String civicAddress,String streetName,int streetNumber,
                                int apartmentNumber,double squareFoot, int numberOfBedRooms,
                                int numberOfBathRooms) {
            PropertyFactory propertyFactory=new PropertyFactory();
            propertyList.add(propertyFactory.addProperty(propertyType,postalCode,cityName,
                            province, civicAddress,streetName,streetNumber,
                            apartmentNumber,squareFoot, numberOfBedRooms,
                            numberOfBathRooms));
            return;
        }
    public void addTenant(String tenantName, long sin) {

        }

    public void rentUnit(Property property, Tenant tenant){

    }

    public ArrayList<Property> displayProperty(){
            //Need to rethink whether to return string or ArrayList
            return propertyList;
    }

    public void displayTenant(){

    }

    public void displayRentedUnit(){

    }

    public void displayVacantUnit(){

    }
    public void displayLeases(){

    }
    public void displayRentPaidStatus() {

    }
}

