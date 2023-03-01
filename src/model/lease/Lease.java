package model.lease;

import model.tenant.Tenant;

import java.util.Date;

public class Lease {
    String LeaseInfo;
    String leaseStartDate;
    String leaseEndDate;
    double rentAmount;
    Tenant tenant;

    public Lease(String leaseInfo, String leaseStartDate, String leaseEndDate, double rentAmount, Tenant tenant) {
        LeaseInfo = leaseInfo;
        this.leaseStartDate = leaseStartDate;
        this.leaseEndDate = leaseEndDate;
        this.rentAmount = rentAmount;
        this.tenant = tenant;
    }

    public String getLeaseInfo() {
        return LeaseInfo;
    }

    public void setLeaseInfo(String leaseInfo) {
        LeaseInfo = leaseInfo;
    }

    public String getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(String leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(String leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
