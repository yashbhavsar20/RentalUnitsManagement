package model.tenant;

public class Tenant {
    private String name;
    int age;
    String email;
    boolean isRentPaid;

    public Tenant(String name, int age, String email, boolean isRentPaid) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isRentPaid = isRentPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRentPaid() {
        return isRentPaid;
    }

    public void setRentPaid(boolean rentPaid) {
        isRentPaid = rentPaid;
    }
}
