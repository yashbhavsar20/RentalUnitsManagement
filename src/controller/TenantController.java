package controller;

import interfaces.RentalSystemInterface;
import model.tenant.Tenant;
import service.RentalServices;

import java.util.ArrayList;

public class TenantController {
    public TenantController() {
    }
    private RentalSystemInterface rentalInterface=new RentalServices();

    public String addNewTenant(String name,int age,String email) {
        return rentalInterface.addTenant(name,age,email);
    }
    public ArrayList<Tenant> displayAllTenants() {
        return rentalInterface.displayTenant();
    }
    public String payTenantRent(String tenantID) {
        return rentalInterface.payRent(tenantID);
    }
}
