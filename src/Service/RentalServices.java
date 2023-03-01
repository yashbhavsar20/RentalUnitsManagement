package Service;

import Interface.RentalSystemInterface;
import Model.Factory.PropertyFactory;
import Model.Property.Property;
import Model.Tenant.Tenant;

import java.util.ArrayList;

public class RentalServices implements RentalSystemInterface {
        ArrayList<Property> propertyList=new ArrayList<>();
        public void addProperty(String type,int streetNumber, String streetName, String cityName,
                                String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
                                int numberOfBathRooms, double squareFoot) {
            PropertyFactory propertyFactory=new PropertyFactory();
            propertyList.add(propertyFactory.addProperty(type,streetNumber, streetName, cityName,
                    postalCode,civicAddress,apartmentNumber, numberOfBedRooms,
                    numberOfBathRooms, squareFoot));
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
