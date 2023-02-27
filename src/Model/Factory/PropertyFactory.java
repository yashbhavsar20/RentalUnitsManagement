package Model.Factory;

import Model.Property.Property;
import Model.Property.ConcreteProperty.Apartment;
import Model.Property.ConcreteProperty.Condo;
import Model.Property.ConcreteProperty.House;

public class PropertyFactory {
	
	public Property getPropertyType(String propertyType) {
		if (propertyType.equals("APARTMENT")) {
			return new Apartment();
		}
		else if (propertyType.equals("CONDO")) {
			return new Condo(); 
		}
		else if(propertyType.equals("HOUSE")) {
			return new House();
		}
		else {
			return null;
		}
	}
}
