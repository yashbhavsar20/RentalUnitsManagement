package View;

import java.util.Scanner;

import Service.PropertyAddService;

public class MainMenu {
	static Scanner userInput=new Scanner(System.in);
	public static void main(String[] args) {
		boolean programRun=true;
		while(programRun) {
			displayMenu();
			int userChoice=Integer.parseInt(userInput.nextLine().trim());	//Main Menu
			switch(userChoice) {
				case 1:{
					boolean propertyMenuFlag=true;
					while(propertyMenuFlag) {
						displayPropertyMenu();									//Property Menu
						String result="";
						PropertyAddService propertyAddService=new PropertyAddService();
						int propertyChoice=Integer.parseInt(userInput.next().trim());
						if (propertyChoice==1) {
							result=propertyAddService.getProperty("APARTMENT");
							System.out.println(result +" Added Successfully");
						}
						else if (propertyChoice==2) {
							result=propertyAddService.getProperty("CONDO");
							System.out.println(result +" Added Successfully");
						}
						else if (propertyChoice==3) {
							result=propertyAddService.getProperty("HOUSE");
							System.out.println(result+" Added Successfully");
						}
						else if (propertyChoice==4) {
							propertyMenuFlag=false;
						}
						else {
							System.out.println("Choose from the menu");
						}
					}
					
					break;
				}
				case 2:{
					programRun=false;
					break;
				}
			}
			
		}
		
	}
	static void displayMenu() {
		System.out.println("Choose: \n 1. Add a property \n 2. Exit");
	}
	static void displayPropertyMenu() {
		System.out.println("Choose: \n 1.Apartment \n 2.Condo \n 3.House \n 4.Exit");
	}
}
