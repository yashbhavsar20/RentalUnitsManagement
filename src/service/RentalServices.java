package service;

import model.property.concrete_property.ApartmentBuilding;
import model.property.concrete_property.Condo;
import model.property.concrete_property.House;
import model.property.property_details.PropertyDetails;
import model.request_model.ApartmentRequest;
import rental_interface.RentalSystemInterface;
import model.factory.PropertyFactory;
import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void displayRentedUnit() {
        ArrayList<Property> displayRentedProperty = new ArrayList<>();
        for (int i = 0; i < propertyList.size(); i++) {
            Property property = propertyList.get(i);
            if (property instanceof ApartmentBuilding) {
                HashMap<Integer, PropertyDetails> apartments = ((ApartmentBuilding) property).getApartments();
                for (int key : apartments.keySet()) {
                    if (apartments.get(key).isOccupied()) {
                        displayRentedProperty.add(property);
                    }
                }
            } else if (property instanceof Condo) {
                if (((Condo) property).getPropertyDetails().isOccupied()) {
                    displayRentedProperty.add(property);
                }

            } else if (((House) property).getPropertyDetails().isOccupied()) {
                displayRentedProperty.add(property);
            }

        }
        return displayRentedProperty;
    }



    public void displayVacantUnit(){
            ArrayList<Property> displayVacantProperty=new ArrayList<>();

        for(int i=0;i<propertyList.size();i++)
        {
            Property property= propertyList.get(i);
            if(property instanceof ApartmentBuilding)
            {
                HashMap<Integer, PropertyDetails> apartments=((ApartmentBuilding) property).getApartments();
                for ( int  key : apartments.keySet() ) {
                    if(!apartments.get(key).isOccupied())
                    {
                        displayVacantProperty.add(property);
                    }
                }
            } else if (property instanceof Condo) {
                if(!((Condo) property).getPropertyDetails().isOccupied())
                {
                    displayVacantProperty.add(property);
                }

            }
            else
            if(!((House) property).getPropertyDetails().isOccupied())
            {
                displayVacantProperty.add(property);
            }

        }
        return displayVacantProperty;



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

