package model.request_model;

public class ApartmentRequest {

    private String propertyID;
    private int apartmentNumber;
    private double squareFootage;
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    public ApartmentRequest(String propertyID,int apartmentNumber, double squareFootage, int numberOfBedrooms, int numberOfBathrooms) {
        this.propertyID=propertyID;
        this.apartmentNumber = apartmentNumber;
        this.squareFootage = squareFootage;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
}
