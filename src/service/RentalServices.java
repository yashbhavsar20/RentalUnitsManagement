package service;

import model.lease.Lease;
import model.property.concrete_property.ApartmentBuilding;
import model.property.concrete_property.Condo;
import model.property.concrete_property.House;
import model.property.property_details.PropertyDetails;
import model.request_model.ApartmentRequest;
import interfaces.RentalSystemInterface;
import model.factory.PropertyFactory;
import model.property.Property;
import model.tenant.Tenant;

import java.util.ArrayList;
import java.util.HashMap;

public class RentalServices implements RentalSystemInterface {
    ArrayList<Property> propertyList=new ArrayList<>();
    ArrayList<Tenant> tenantList=new ArrayList<>();
    ArrayList<Lease> leaseList=new ArrayList<>();
    ArrayList<Tenant> subscriberList=new ArrayList<>();

    public String addProperty(String propertyID,String propertyType, String postalCode, String cityName,
                              String province, String civicAddress, String streetName, int streetNumber,
                              int apartmentNumber, double squareFoot, int numberOfBedRooms,
                              int numberOfBathRooms, ArrayList<ApartmentRequest> apartmentList) {
        String result="";
        PropertyFactory propertyFactory=new PropertyFactory();
        propertyList.add(propertyFactory.addConcreteProperty(propertyID,propertyType,postalCode,cityName,
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

    public String rentUnit(String propertyID, String tenantID,String leaseInfo,String leaseStartDate,
                           String leaseEndDate, double rentAmount){
        leaseInfo="This is a lease between a tenant and a Landlord";
        leaseStartDate="05-03-2023";
        leaseEndDate="05-03-2023";
        rentAmount=1200;
        Tenant rentingTenant=null;
        String result="";
        boolean tentantFound=false;
        for (Tenant tenant: tenantList){
            if (tenant.getTenantId().equals(tenantID)){
                rentingTenant=tenant;
                tentantFound=true;
            }
        }
        if(tentantFound){
            for (Property property: propertyList){
                if(property instanceof Condo){
                    //Check whether it is occupied or not.
                    if(!((Condo)property).getPropertyDetails().isOccupied()){
                        if(((Condo)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            //Create a new Lease.
                            Lease lease=new Lease(leaseInfo,leaseStartDate,leaseEndDate,rentAmount,rentingTenant);
                            //Add the lease to the list
                            leaseList.add(lease);
                            //Make Property Unavailable
                            ((Condo)property).getPropertyDetails().setOccupied(true);
                            result="Lease added Successfully";
                        }
                    }
                    else{
                        if(((Condo)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            ArrayList<Tenant> existingSubscriberList=((Condo)property).getPropertyDetails().getSubscribersList();
                            ArrayList<Tenant> updateSubscriberList=new ArrayList<>();
                            for (Tenant existingTenant:existingSubscriberList){
                                updateSubscriberList.add(existingTenant);
                            }
                            updateSubscriberList.add(rentingTenant);
                            ((Condo)property).getPropertyDetails().setSubscribersList(updateSubscriberList);
                        }
                        result="This property is already occupied. \n You have been added to the subsribers list.";
                    }

                }
                else if (property instanceof ApartmentBuilding) {
                    HashMap<Integer, PropertyDetails> apartments=((ApartmentBuilding) property).getApartments();
                    for (PropertyDetails details: apartments.values()) {
                        if (!details.isOccupied()) {
                            if (details.getPropertyID().equals(propertyID)) {
                                //Create a new Lease.
                                Lease lease = new Lease(leaseInfo, leaseStartDate, leaseEndDate, rentAmount, rentingTenant);
                                //Add the lease to the list
                                leaseList.add(lease);
                                //Make Property Unavailable
                                details.setOccupied(true);
                                result = "Lease Added Successfully";
                            }
                        }
                        else {
                            if (details.getPropertyID().equals(propertyID)){
                                ArrayList<Tenant> existingSubscriberList=details.getSubscribersList();
                                ArrayList<Tenant> updateSubscriberList=new ArrayList<>();
                                for (Tenant existingTenant:existingSubscriberList){
                                    updateSubscriberList.add(existingTenant);
                                }
                                updateSubscriberList.add(rentingTenant);
                                details.setSubscribersList(updateSubscriberList);
                                result="This property is already occupied. \n You have been added to the subsribers list.";
                            }

                        }

                    }
                }

                else if (property instanceof House) {
                    //check it is occupied or not
                    if(!((House)property).getPropertyDetails().isOccupied()){
                        if(((House)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            //Create a new Lease.
                            Lease lease=new Lease(leaseInfo,leaseStartDate,leaseEndDate,rentAmount,rentingTenant);
                            //Add the lease to the list
                            leaseList.add(lease);
                            //Make Property Unavailable
                            ((House)property).getPropertyDetails().setOccupied(true);
                            result="Lease added Successfully";
                        }
                    }
                    else{
                        if(((House)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            ArrayList<Tenant> existingSubscriberList=((House)property).getPropertyDetails().getSubscribersList();
                            ArrayList<Tenant> updateSubscriberList=new ArrayList<>();
                            for (Tenant existingTenant:existingSubscriberList){
                                updateSubscriberList.add(existingTenant);
                            }
                            updateSubscriberList.add(rentingTenant);
                            ((House)property).getPropertyDetails().setSubscribersList(updateSubscriberList);
                            result="This property is already occupied. \n You have been added to the subsribers list.";
                        }

                    }
                }

            }
        }
        else{
            result="Tenant not found";
        }

        return result;
    }

    public ArrayList<Property> displayProperty(){
        //Need to rethink whether to return string or ArrayList
        return propertyList;
    }

    public ArrayList<Tenant> displayTenant(){
        return tenantList;
    }

    public ArrayList<Property> displayRentedUnit() {
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



    public ArrayList<Property> displayVacantUnit(){
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

