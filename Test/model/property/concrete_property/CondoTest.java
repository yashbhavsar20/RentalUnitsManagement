package model.property.concrete_property;

import model.address.Address;
import model.lease.Lease;
import model.property.concrete_property.Condo;
import model.property.property_details.PropertyDetails;
import model.tenant.Tenant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;




class CondoTest {
    String postalCode = "H4P2B2";
    String province = "Quebec";
    String city="Montreal";
    String propertyID="01";
    double squareFoot=12.0;
    int numberOfBedRooms=2;
    int numberOfBathRoom=1;
    boolean isOccupied = false;
    Lease lease=null;
    ArrayList<Tenant> subscribersList=new ArrayList<>();
    //String propertyID,double squareFoot, int numberOfBedRooms, int numberOfBathRooms, boolean isOccupied, Lease lease


    Address address=new Address(postalCode,province,city);
    String streetName;
    int streetNumber;
    int unitNumber;
    PropertyDetails propertyDetails=new PropertyDetails(propertyID,squareFoot,numberOfBedRooms,numberOfBathRoom,isOccupied,lease);

    //Address address, String streetName, int streetNumber, int unitNumber, PropertyDetails propertyDetails
    Condo condo=new Condo(address,streetName,streetNumber,unitNumber,propertyDetails);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPropertyType() {
        assertEquals("CONDO",condo.getPropertyType());
    }

    @Test
    void setPropertyType() {

    }

    @Test
    void getAddress() {

        assertEquals(address,condo.getAddress());
    }

    @Test
    void setAddress() {
    }

    @Test
    void getStreetName() {
        assertEquals(streetName,condo.getStreetName());
    }

    @Test
    void setStreetName() {
    }

    @Test
    void getStreetNumber() {
        assertEquals(streetNumber,condo.getStreetNumber());
    }

    @Test
    void setStreetNumber() {
    }

    @Test
    void getUnitNumber() {
        assertEquals(unitNumber,condo.getUnitNumber());
    }

    @Test
    void setUnitNumber() {
    }

    @Test
    void getPropertyDetails() {
        assertEquals(propertyDetails,condo.getPropertyDetails());
    }

    @Test
    void setPropertyDetails() {

    }



    @Test
    void displayProperty() {
        assertEquals(false,condo.displayProperty());
    }


}