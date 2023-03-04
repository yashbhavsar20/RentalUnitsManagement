package service;

import model.property.concrete_property.ApartmentBuilding;
import model.property.concrete_property.Condo;
import model.property.concrete_property.House;
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

        HashMap<Property,Tenant> leaseList=new HashMap<>();

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

    public String rentUnit(String propertyID, String tenantID){
        Property rentingProperty;
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
                            rentingProperty=property;
                            //Add property and tenant in leeseList
                            leaseList.put(rentingProperty,rentingTenant);
                            //Make Property Unavailable
                            ((Condo)property).getPropertyDetails().setOccupied(true);
                            //Fetch all subscribers
                            ArrayList<Tenant> exixtingSubcribers=((Condo)property).getPropertyDetails().getSubscribersList();
                            // updated subscribers list
                            ArrayList<Tenant> temp=new ArrayList<>();
                            for (Tenant existingTenant : exixtingSubcribers){
                                temp.add(existingTenant);
                            }
                            temp.add(rentingTenant);
                            ((Condo) property).getPropertyDetails().setSubscribersList(temp);
                            result="Rent added Successfully";
                        }
                    }
                    else{
                        result="This property is already occupied";
                    }

                }
                else if (property instanceof House) {
                    if(!((House)property).getPropertyDetails().isOccupied()){
                        if(((House)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            rentingProperty=property;
                            leaseList.put(rentingProperty,rentingTenant);
                            ((House)property).getPropertyDetails().setOccupied(true);       //Make Property Unavailable
                            ArrayList<Tenant> exixtingSubcribers=((House)property).getPropertyDetails().getSubscribersList();
                            // updated Tenant list
                            ArrayList<Tenant> temp=null;
                            for (Tenant existingTenant : exixtingSubcribers){
                                temp.add(existingTenant);
                            }
                            temp.add(rentingTenant);
                            ((House) property).getPropertyDetails().setSubscribersList(temp);
                            result="Rent added Successfully";
                        }
                    }
                    else{
                        result="This property is already occupied";
                    }

                }
                else if (property instanceof ApartmentBuilding) {
                    if(!((House)property).getPropertyDetails().isOccupied()){
                        if(((House)property).getPropertyDetails().getPropertyID().equals(propertyID)){
                            rentingProperty=property;
                            leaseList.put(rentingProperty,rentingTenant);
                            ((House)property).getPropertyDetails().setOccupied(true);       //Make Property Unavailable
                            ArrayList<Tenant> exixtingSubcribers=((House)property).getPropertyDetails().getSubscribersList();
                            // updated Tenant list
                            ArrayList<Tenant> temp=null;
                            for (Tenant existingTenant : exixtingSubcribers){
                                temp.add(existingTenant);
                            }
                            temp.add(rentingTenant);
                            ((House) property).getPropertyDetails().setSubscribersList(temp);
                            result="Rent added Successfully";
                        }
                    }
                    else{
                        result="This property is already occupied";
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

