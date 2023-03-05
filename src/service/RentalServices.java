package service;

import model.lease.Lease;
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
        ArrayList<Lease> leaseList=new ArrayList<>();

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
                            result="Rent added Successfully";
                        }
                    }
                    else{
                        result="This property is already occupied";
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
                                result = "Rent Added Successfully";
                            }
                        } else {
                            result = "This property is already occupied";
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

