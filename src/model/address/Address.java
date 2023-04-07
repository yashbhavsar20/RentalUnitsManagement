package model.address;

public class Address {
    private String postalCode;
    private String province;
    private String city;

    public Address(String postalCode, String province, String city) {
        this.postalCode = postalCode;
        this.province = province;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address Details:" + "\n" +
                ",postalCode= " + postalCode + "\n" +
                ", province= " + province + "\n" +
                ", city= " + city;
    }
}
