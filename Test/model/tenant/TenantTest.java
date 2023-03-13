package model.tenant;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenantTest {
     String tenantId;
     String name="Manish Gautam";
    int age=28;
    String email="@gmail.com";
    boolean isRentPaid=true;
    Tenant tenant= new Tenant(name,age,email,isRentPaid);


    @BeforeEach
    void setUp() {
        tenantId=tenant.getTenantId();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getTenantId() {
        assertFalse(tenant.getTenantId().isEmpty()
        );
    }

    @Test
    void getName() {
        assertEquals(name,tenant.getName());
    }

    @Test
    void setName() {
        assertEquals(tenant.getName(),name);
    }

    @Test
    void getAge() {
        assertEquals(age,tenant.getAge());
    }

    @Test
    void setAge() {
        assertEquals(tenant.getAge(),age);
    }

    @Test
    void getEmail() {
        assertEquals(email,tenant.getEmail());
    }

    @Test
    void setEmail() {
        assertEquals(tenant.getEmail(),email);
    }

    @Test
    void isRentPaid() {
        assertEquals(isRentPaid,tenant.isRentPaid());
    }

    @Test
    void setRentPaid() {
        assertEquals(tenant.isRentPaid(),true);
    }

    @Test
    void testToString() {
        assertTrue(tenant.toString().contains("Tenant Details: \n" +
                "tenant ID= " + tenantId + '\n' +
                "name= " + name + '\n' +
                "age= " + age + '\n' +
                "email= " + email + '\n' +
                "isRentPaid= " + isRentPaid + '\n'));
    }
}