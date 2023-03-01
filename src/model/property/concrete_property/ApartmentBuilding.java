package model.property.concrete_property;

import model.address.Address;
import model.property.Property;

import java.util.HashMap;

public class ApartmentBuilding extends Property {
    private Address address;
    private String civicAddress;
    private HashMap<Integer, PropertyDetails> apartments = new HashMap<Integer, PropertyDetails>();

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
    public String addProperty() {
        return null;
    }
}
