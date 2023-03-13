package model.property.property_details;

import model.lease.Lease;
import model.tenant.Tenant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PropertyDetailsTest {
    String LeaseInfo="This is dummy lease info";
    String leaseStartDate="020423";
    String leaseEndDate="020424";
    double rentAmount=1245.0;
  //  String tenantId="102345";
    String name="Manish Gautam";
    int age=28;
    String email="@gmail.com";
    boolean isRentPaid=true;
    String name1="Lakshya kalia";
    int age1=28;
    String email1="@gmail.com";
    boolean isRentPaid1=true;
    Tenant tenant= new Tenant(name,age,email,isRentPaid);
    Tenant tenant1=new Tenant(name1,age1,email1,isRentPaid1);
    String propertyID="01";
    Lease lease=new Lease(LeaseInfo,leaseStartDate,leaseEndDate,rentAmount,tenant,propertyID);

    double squareFoot=12.0;
    int numberOfBedRooms=2;
    int numberOfBathRoom=1;
    PropertyDetails propertyDetails=new PropertyDetails(propertyID,squareFoot,numberOfBedRooms,numberOfBathRoom);
    PropertyDetails propertyDetails1=new PropertyDetails(propertyID,squareFoot,numberOfBedRooms,numberOfBathRoom,false,lease);
    ArrayList<Tenant> subscribersList=new ArrayList<>();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPropertyID() {
        assertEquals(propertyID,propertyDetails.getPropertyID());
    }

    @Test
    void setPropertyID() {
      assertEquals(propertyDetails.getPropertyID(),propertyID);
    }

    @Test
    void getSquareFoot() {
        assertEquals(squareFoot,propertyDetails.getSquareFoot());
    }

    @Test
    void setSquareFoot() {
      assertEquals(propertyDetails.getSquareFoot(),squareFoot);
    }

    @Test
    void getNumberOfBedRooms() {
        assertEquals(numberOfBedRooms,propertyDetails.getNumberOfBedRooms());
    }

    @Test
    void setNumberOfBedRooms() {
      assertEquals(propertyDetails.getNumberOfBedRooms(),numberOfBedRooms);
    }

    @Test
    void getNumberOfBathRooms() {
        assertEquals(numberOfBathRoom,propertyDetails.getNumberOfBathRooms());
    }

    @Test
    void setNumberOfBathRooms() {
      assertEquals(propertyDetails.getNumberOfBathRooms(),numberOfBathRoom);
    }

    @Test
    void isOccupied() {
        assertEquals(false,propertyDetails.isOccupied());
    }

    @Test
    void setOccupied() {
      assertEquals(propertyDetails1.isOccupied(),false);
    }

    @Test
    void getLease() {
        assertEquals(lease,propertyDetails1.getLease());
    }

    @Test
    void setLease() {
      assertEquals(propertyDetails1.getLease(),lease);
    }

    @Test
    void getSubscribersList() {
        subscribersList.add(tenant);
        subscribersList.add(tenant1);
        propertyDetails1.setSubscribersList(subscribersList);
        assertEquals(subscribersList,propertyDetails1.getSubscribersList());

    }

    @Test
    void setSubscribersList() {
      assertEquals(propertyDetails1.getSubscribersList(),subscribersList);
    }
}