package model.property.concrete_property;

import model.address.Address;
import model.property.Property;
import model.property.property_details.PropertyDetails;
import model.request_model.ApartmentRequest;
import interfaces.PropertyDisplay;

import java.util.ArrayList;
import java.util.HashMap;

public class ApartmentBuilding extends Property implements PropertyDisplay {
    private String propertyType="APARTMENT";
    private Address address;
    private String civicAddress;
    private HashMap<Integer, PropertyDetails> apartments = new HashMap<Integer, PropertyDetails>();

    public ApartmentBuilding(Address address, String civicAddress, ArrayList<ApartmentRequest> apartmentList) {
        this.address = address;
        this.civicAddress = civicAddress;
        for (ApartmentRequest apartmentRequest : apartmentList) {
            apartments.put(apartmentRequest.getApartmentNumber(), new PropertyDetails(apartmentRequest.getSquareFootage(), apartmentRequest.getNumberOfBedrooms(), apartmentRequest.getNumberOfBathrooms()));
        }
    }


    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCivicAddress() {
        return civicAddress;
    }

    public void setCivicAddress(String civicAddress) {
        this.civicAddress = civicAddress;
    }

    public HashMap<Integer, PropertyDetails> getApartments() {
        return apartments;
    }

    public void setApartments(HashMap<Integer, PropertyDetails> apartments) {
        this.apartments = apartments;
    }


//    @Override
//    public String toString() {
//        return "ApartmentBuilding{" +
//                "propertyType='" + propertyType + '\'' +
//                ", address=" + address +
//                ", civicAddress='" + civicAddress + '\'' +
//                ", apartments=" + apartments +
//                ", streetNumber=" + streetNumber +
//                ", streetName='" + streetName + '\'' +
//                ", cityName='" + cityName + '\'' +
//                ", postalCode='" + postalCode + '\'' +
//                '}';
//    }

    @Override
    public String addProperty() {
        return null;
    }

    @Override
    public void displayProperty() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Address: " + address.getCity() + ", " + address.getProvince() + ", " + address.getPostalCode()
                + ", " + getCivicAddress() + ", ");
        System.out.println("Apartments: ");
        for (Integer apartmentNumber : apartments.keySet()) {
            System.out.println("Apartment Number: " + apartmentNumber);
            System.out.println("Square Footage: " + apartments.get(apartmentNumber).getSquareFoot());
            System.out.println("Number of Bedrooms: " + apartments.get(apartmentNumber).getNumberOfBedRooms());
            System.out.println("Number of Bathrooms: " + apartments.get(apartmentNumber).getNumberOfBathRooms());
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
}
