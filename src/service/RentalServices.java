package service;

import rental_interface.RentalSystemInterface;
import model.factory.PropertyFactory;
import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;

public class RentalServices implements RentalSystemInterface {
        ArrayList<Property> propertyList=new ArrayList<>();
        ArrayList<Tenant> tenantList=new ArrayList<>();
        public void addProperty(String type,int streetNumber, String streetName, String cityName,
                                String postalCode, String civicAddress, int apartmentNumber, int numberOfBedRooms,
                                int numberOfBathRooms, double squareFoot) {
            PropertyFactory propertyFactory=new PropertyFactory();
            propertyList.add(propertyFactory.addProperty(type,streetNumber, streetName, cityName,
                    postalCode,civicAddress,apartmentNumber, numberOfBedRooms,
                    numberOfBathRooms, squareFoot));
            return;
        }
    public String addTenant(String tenantName, int age, String email){
        Tenant tenant=new Tenant(tenantName,age,email,false);
        tenantList.add(tenant);
        return "Tenant: " + tenant.getTenantId() + " added successfully";
    }

    public void rentUnit(Property property, Tenant tenant){

    }

    public ArrayList<Property> displayProperty(){
            //Need to rethink whether to return string or ArrayList
            return propertyList;
    }

    public void displayTenant(){
        for (Tenant tenant:tenantList)
            System.out.println("---------------------------------\n" +
                    tenant.toString() +
                    "---------------------------------\n");
    }

    public void displayRentedUnit(){

    }

    public void displayVacantUnit(){

    }
    public void displayLeases(){

    }
    public void displayRentPaidStatus(boolean rentPaid) {
            for (Tenant tenant:tenantList)
                if (tenant.isRentPaid()==rentPaid)
                    System.out.println("---------------------------------\n" +
                            tenant.toString() +
                            "---------------------------------\n");
    }
}

