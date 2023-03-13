package model.request_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentRequestTest {
    int ApNo=201;
    String propertyID="01";
    double squareFoot=12.0;
    int numberOfBedRooms=2;
    int numberOfBathRoom=1;

    ApartmentRequest App1=new ApartmentRequest(propertyID,ApNo,squareFoot,numberOfBedRooms,numberOfBathRoom);

    @Test
    void getApartmentNumber() {
        assertEquals(ApNo,App1.getApartmentNumber());
    }

    @Test
    void getSquareFootage() {
        assertEquals(squareFoot,App1.getSquareFootage());
    }

    @Test
    void getPropertyID() {
        assertEquals(propertyID,App1.getPropertyID());
    }

    @Test
    void getNumberOfBedrooms() {
        assertEquals(numberOfBedRooms,App1.getNumberOfBedrooms());
    }

    @Test
    void getNumberOfBathrooms() {
        assertEquals(numberOfBathRoom,App1.getNumberOfBathrooms());
    }

    @Test
    void setApartmentNumber() {

        assertEquals(App1.getApartmentNumber(), ApNo);
    }

    @Test
    void setSquareFootage() {
        assertEquals(App1.getSquareFootage(), squareFoot);
    }

    @Test
    void setPropertyID() {
        assertEquals(App1.getPropertyID(), propertyID);
    }

    @Test
    void setNumberOfBedrooms() {
        assertEquals(App1.getNumberOfBedrooms(), numberOfBedRooms);
    }

    @Test
    void setNumberOfBathrooms() {
        assertEquals(App1.getNumberOfBathrooms(), numberOfBathRoom);
    }
}