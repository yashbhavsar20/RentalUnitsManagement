package Model.Property.ConcreteProperty;

import Model.Property.Property;
public class House extends Property{

	public House(int streetNumber, String streetName, String cityName,
				 String postalCode){
		this.streetNumber=streetNumber;
		this.streetName=streetName;
		this.cityName=cityName;
		this.postalCode=postalCode;
	}




	@Override
	public String addProperty() {
		// TODO Auto-generated method stub
		return "House";
	}
	
}
