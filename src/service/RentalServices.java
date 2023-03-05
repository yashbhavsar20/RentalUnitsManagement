package service;

import model.request_model.ApartmentRequest;
import interfaces.RentalSystemInterface;
import model.factory.PropertyFactory;
import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;

public class RentalServices implements RentalSystemInterface {
        ArrayList<Property> propertyList=new ArrayList<>();
        ArrayList<Tenant> tenantList=new ArrayList<>();

        public String addProperty(String propertyType, String postalCode, String cityName,
                                  String province, String civicAddress, String streetName, int streetNumber,
                                  int apartmentNumber, double squareFoot, int numberOfBedRooms,
                                  int numberOfBathRooms, ArrayList<ApartmentRequest> apartmentList) {
            String result="";
            PropertyFactory propertyFactory=new PropertyFactory();
            propertyList.add(propertyFactory.addConcreteProperty(propertyType,postalCode,cityName,
                            province, civicAddress,streetName,streetNumber,
                            apartmentNumber,squareFoot, numberOfBedRooms,
                            numberOfBathRooms,apartmentList));
            return "Property Added Successfully";
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

    public ArrayList<Tenant> displayTenant(){
        return tenantList;
    }

    public void displayRentedUnit(){

    }

    public void displayVacantUnit(){

    }
    public void displayLeases(){

    }
    public ArrayList<Tenant> displayRentPaidStatus(boolean rentPaid) {
            ArrayList<Tenant> tenantListResponse=new ArrayList<>();
            for (Tenant tenant:tenantList)
            {
                if(tenant.isRentPaid()==rentPaid)
                {
                    tenantListResponse.add(tenant);
                }
            }
            return tenantListResponse;
    }
}

