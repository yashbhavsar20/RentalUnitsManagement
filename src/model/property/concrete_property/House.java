package model.property.concrete_property;

import model.address.Address;
import model.property.Property;
import model.property.property_details.PropertyDetails;
import interfaces.PropertyDisplay;

public class House extends Property implements PropertyDisplay {
	private String propertyType="HOUSE";
	private Address address;
	private String streetName;
	private int streetNumber;
	private PropertyDetails propertyDetails;

	public House(Address address, String streetName, int streetNumber, PropertyDetails propertyDetails) {
		this.address = address;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.propertyDetails = propertyDetails;
	}

	@Override
	public String toString() {
		return "House: " +
				"propertyType= " + propertyType + '\n' +
				", address= " + address + "\n" +
				", streetName= " + streetName + '\n' +
				", streetNumber= " + streetNumber + "\n" +
				", propertyDetails= " + propertyDetails;
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

//	@Override
	public String getStreetName() {
		return streetName;
	}

//	@Override
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


//	@Override
	public int getStreetNumber() {
		return streetNumber;
	}

//	@Override
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public PropertyDetails getPropertyDetails(String propertyID) {
		if(this.propertyDetails.getPropertyID().equals(propertyID)){
			return propertyDetails;
		}
		else {
			return null;
		}
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	@Override
	public String addProperty() {
		return null;
	}

	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	@Override
	public boolean displayProperty() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Address: " + address.getCity() + ", " + address.getProvince() + ", " + address.getPostalCode()
		+ ", " + getStreetName() + ", " + getStreetNumber() + ", " + propertyDetails.getNumberOfBathRooms()
		+ ", " + propertyDetails.getNumberOfBedRooms() + ", " + propertyDetails.getSquareFoot());
		System.out.println("---------------------------------------------------------------------------------");
        return false;
    }
}
