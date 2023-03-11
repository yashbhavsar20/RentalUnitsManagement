package model.property.property_details;

import model.lease.Lease;
import model.tenant.Tenant;
import java.util.ArrayList;

public class PropertyDetails {
    String propertyID;
    double squareFoot;
    int numberOfBedRooms;
    int numberOfBathRooms;
    boolean isOccupied = false;
    Lease lease;
    ArrayList<Tenant> subscribersList=new ArrayList<>();

    public PropertyDetails(String propertyID,double squareFoot, int numberOfBedRooms, int numberOfBathRooms, boolean isOccupied, Lease lease) {
        this.propertyID=propertyID;
        this.squareFoot = squareFoot;
        this.numberOfBedRooms = numberOfBedRooms;
        this.numberOfBathRooms = numberOfBathRooms;
        this.isOccupied = isOccupied;
        this.lease = lease;
    }

    public PropertyDetails(String propertyID,double squareFoot, int numberOfBedRooms, int numberOfBathRooms) {
        this.propertyID=propertyID;
        this.squareFoot = squareFoot;
        this.numberOfBedRooms = numberOfBedRooms;
        this.numberOfBathRooms = numberOfBathRooms;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public double getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(double squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    public void setNumberOfBedRooms(int numberOfBedRooms) {
        this.numberOfBedRooms = numberOfBedRooms;
    }

    public int getNumberOfBathRooms() {
        return numberOfBathRooms;
    }

    public void setNumberOfBathRooms(int numberOfBathRooms) {
        this.numberOfBathRooms = numberOfBathRooms;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public ArrayList<Tenant> getSubscribersList() {
        return subscribersList;
    }

    public void setSubscribersList(ArrayList<Tenant> subscribersList) {
        this.subscribersList = subscribersList;
    }
    public void notifySubscribers(){
        for(Tenant tenant:subscribersList){
            tenant.update();
        }
    }
}
