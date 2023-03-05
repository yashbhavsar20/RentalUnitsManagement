package controller;

import interfaces.RentalSystemInterface;
import service.RentalServices;

public class TenantController {
    public TenantController() {
    }
    private RentalSystemInterface rentalInterface=new RentalServices();

    public String addNewTenant(String name,int age,String email) {
        return rentalInterface.addTenant(name,age,email);
    }
}
