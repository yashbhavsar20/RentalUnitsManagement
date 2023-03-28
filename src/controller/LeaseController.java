package controller;

import interfaces.RentalSystemInterface;
import model.response_model.LeasePropertyResponseObject;

import java.util.ArrayList;

public class LeaseController {
    public ArrayList<LeasePropertyResponseObject> displayLeases(RentalSystemInterface rentalInterfece){
        return rentalInterfece.displayLeases();
    }
}
