package view;

import rental_interface.RentalSystemInterface;
import model.property.Property;
import service.RentalServices;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalSystemScreen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        welcomeMessage();
    }
    public static void welcomeMessage() {
        System.out.println("Welcome to the Rental System");
        init();
    }
    public static void init(){
        RentalSystemInterface rentalInterface=new RentalServices();
        showMenu();
        String userInput = sc.nextLine();
        while (!userInput.equals("10")) {
            switch (userInput) {
                case "1":
                    showProperty();
                    String userPropertyInput=sc.nextLine();
                    while(!userPropertyInput.equals("4")){
                        System.out.println("Enter Street Number");
                        int streetNumber=Integer.parseInt(sc.nextLine().trim());
                        System.out.println("Enter Street Name");
                        String streetName=sc.nextLine().trim();
                        System.out.println("Enter City Name");
                        String cityName=sc.nextLine().trim();
                        System.out.println("Enter Postal Code");
                        String postalCode=sc.nextLine().trim();
                        String propertyType="";
                        switch (userPropertyInput){
                            case "1":
                                propertyType="APARTMENT";
                                System.out.println("Enter Civic Address");
                                String civicAddress=sc.nextLine().trim();
                                System.out.println("Enter Apartment Number");
                                int apartmentNumber=Integer.parseInt(sc.nextLine().trim());
                                System.out.println("Enter Number of Bed Rooms");
                                int numberOfBedRooms=Integer.parseInt(sc.nextLine().trim());
                                System.out.println("Enter Number of Bath Rooms");
                                int numberOfBathRooms=Integer.parseInt(sc.nextLine().trim());
                                System.out.println("Enter Square Foot");
                                double squareFoot=Double.parseDouble(sc.nextLine().trim());
                                rentalInterface.addProperty(propertyType,streetNumber,streetName, cityName,
                                    postalCode, civicAddress, apartmentNumber,numberOfBedRooms,
                                    numberOfBathRooms, squareFoot);
                                break;

                            case "2":
                                propertyType="CONDO";
                                System.out.println("Enter Unit Number");
                                int unitNumber=Integer.parseInt(sc.nextLine().trim());
                                rentalInterface.addProperty(propertyType,streetNumber,streetName, cityName,
                                        postalCode, "", unitNumber,0,
                                        0, 0);
                                break;

                            case "3":
                                propertyType="House";
                                rentalInterface.addProperty(propertyType,streetNumber,streetName, cityName,
                                        postalCode, "", 0,0,
                                        0, 0);
                                break;

                            default:
                                System.out.println("Invalid Property Type");
                                break;


                        }
                        break;
                    }
                    System.out.println("Property added Successfully");
                    break;
                case "2":
                    System.out.println("Add a tenant");
                    break;
                case "3":
                    System.out.println("Rent a unit");
                    break;
                case "4":
                    System.out.println("Display properties");
                    ArrayList<Property> allPropertiesList= rentalInterface.displayProperty();
                    displayProperties(allPropertiesList);
                    break;
                case "5":
                    System.out.println("Display tenants");
                    break;
                case "6":
                    System.out.println("Display rented units");
                    break;
                case "7":
                    System.out.println("Display vacant units");
                    break;
                case "8":
                    System.out.println("Display all leases");
                    break;
                case "9":
                    System.out.println("Rent paid or not");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            showMenu();
            userInput = sc.nextLine();
        }
        System.out.println("Thank you for using the Rental System");
    }
    public static void showMenu(){
        System.out.println("Please select an option:\n" +
                "1. Add a property\n" +
                "2. Add a tenant\n" +
                "3. Rent a unit\n" +
                "4. Display properties\n" +
                "5. Display tenants\n" +
                "6. Display rented units\n" +
                "7. Display vacant units\n" +
                "8. Display all leases\n" +
                "9. Rent paid or not\n" +
                "10. Exit" );
    }

    public static void showProperty(){
        System.out.println("Please select type of property to add:\n" +
                "1. Apartment\n" +
                "2. Condo\n" +
                "3. House\n"+
                "4. Cancel\n"
        );
    }

    public static void displayProperties(ArrayList<Property> allPropertiesList){
        for(Property property : allPropertiesList){
            System.out.println(property.toString());
        }
    }
}
