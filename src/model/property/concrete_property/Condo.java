package model.property.concrete_property;

import model.address.Address;
import model.property.Property;
import model.property.property_details.PropertyDetails;

public class Condo extends Property{
	private String propertyType="CONDO";
	private Address address;
	private String streetName;
	private int streetNumber;
	private int unitNumber;
	private PropertyDetails propertyDetails;

	public Condo(Address address, String streetName, int streetNumber, int unitNumber, PropertyDetails propertyDetails) {
		this.address = address;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.unitNumber = unitNumber;
		this.propertyDetails = propertyDetails;
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

	@Override
	public String getStreetName() {
		return streetName;
	}

	@Override
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public int getStreetNumber() {
		return streetNumber;
	}

	@Override
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	@Override
	public String addProperty() {
		return null;
	}
}
