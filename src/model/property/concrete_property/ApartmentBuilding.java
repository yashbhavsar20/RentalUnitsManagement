package model.property.concrete_property;

import model.address.Address;
import model.property.Property;
import model.property.property_details.PropertyDetails;

import java.util.HashMap;

public class ApartmentBuilding extends Property {
    private String propertyType="APARTMENT";
    private Address address;
    private String civicAddress;
    private HashMap<Integer, PropertyDetails> apartments = new HashMap<Integer, PropertyDetails>();

    public ApartmentBuilding(String propertyType, Address address, String civicAddress, HashMap<Integer, PropertyDetails> apartments) {
        this.propertyType = propertyType;
        this.address = address;
        this.civicAddress = civicAddress;
        this.apartments = apartments;
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


    @Override
    public String toString() {
        return "ApartmentBuilding{" +
                "propertyType='" + propertyType + '\'' +
                ", address=" + address +
                ", civicAddress='" + civicAddress + '\'' +
                ", apartments=" + apartments +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public String addProperty() {
        return null;
    }
}
