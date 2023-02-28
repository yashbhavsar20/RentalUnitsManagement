package View;

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
        showMenu();
        String userInput = sc.nextLine();
        while (!userInput.equals("10")) {
            switch (userInput) {
                case "1":
                    System.out.println("Add a property");
                    break;
                case "2":
                    System.out.println("Add a tenant");
                    break;
                case "3":
                    System.out.println("Rent a unit");
                    break;
                case "4":
                    System.out.println("Display properties");
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
}
