package Service;

import Model.Factory.PropertyFactory;

public class PropertyAddService {
	public String getProperty(String type) {
		PropertyFactory propertyFactory=new PropertyFactory();
		return propertyFactory.getPropertyType(type).getProperty();
	}
	
	
}
