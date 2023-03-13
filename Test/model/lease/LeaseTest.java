package model.lease;

import model.tenant.Tenant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {
    String LeaseInfo="This is dummy lease info";
    String leaseStartDate="020423";
    String leaseEndDate="020424";
    double rentAmount=1245.0;
    String tenantId="102345";
     String name="Manish Gautam";
    int age=28;
    String email="@gmail.com";
    boolean isRentPaid=true;
    Tenant tenant=new Tenant(name,age,email,isRentPaid);
    String propertyID="01";
    Lease lease=new Lease(LeaseInfo,leaseStartDate,leaseEndDate,rentAmount,tenant,propertyID);



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPropertyID() {
        assertEquals(propertyID,lease.getPropertyID());

    }

    @Test
    void setPropertyID() {
        assertEquals(propertyID,lease.getPropertyID());
    }

    @Test
    void getLeaseInfo() {
        assertEquals(LeaseInfo,lease.getLeaseInfo());
    }

    @Test
    void setLeaseInfo() {
        assertEquals(LeaseInfo,lease.getLeaseInfo());
    }

    @Test
    void getLeaseStartDate() {
        assertEquals(leaseStartDate,lease.getLeaseStartDate());
    }

    @Test
    void setLeaseStartDate() {
        assertEquals(leaseStartDate,lease.getLeaseStartDate());
    }

    @Test
    void getLeaseEndDate() {
        assertEquals(leaseEndDate,lease.getLeaseEndDate());
    }

    @Test
    void setLeaseEndDate() {
        assertEquals(leaseEndDate,lease.getLeaseEndDate());
    }

    @Test
    void getRentAmount() {
        assertEquals(rentAmount,lease.getRentAmount());
    }

    @Test
    void setRentAmount() {
        assertEquals(rentAmount,lease.getRentAmount());
    }

    @Test
    void getTenant() {
        assertEquals(tenant,lease.getTenant());
    }

    @Test
    void setTenant() {
        assertEquals(tenant,lease.getTenant());
    }

    @Test
    void testToString() {
        assertTrue(lease.toString().contains("Lease{" +
                "LeaseInfo='" + LeaseInfo + '\'' +
                ", leaseStartDate='" + leaseStartDate + '\'' +
                ", leaseEndDate='" + leaseEndDate + '\'' +
                ", rentAmount=" + rentAmount +
                ", tenant=" + tenant +
                '}'));
    }

}