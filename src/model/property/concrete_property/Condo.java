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

	@Override
	public String addProperty() {
		return null;
	}
}
