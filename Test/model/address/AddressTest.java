package model.address;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    String postalCode = "H4P2B2";
    String province = "Quebec";
    String city="Montreal";
    Address address=new Address(postalCode,province,city);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPostalCode() {
        assertEquals(postalCode,address.getPostalCode());
    }

    @Test
    void getProvince() {
        assertEquals(province,address.getProvince());
    }

    @Test
    void getCity() {
        assertEquals(city,address.getCity());
    }

    @Test
    void testToString() {
        assertTrue(address.toString().contains("Address{" +
                "postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}'));
    }
}