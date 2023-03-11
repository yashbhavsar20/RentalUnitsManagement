package model.tenant;

public class Tenant {
    private String tenantId;
    private String name;
    int age;
    String email;
    boolean isRentPaid;

    public Tenant(String name, int age, String email, boolean isRentPaid) {
        this.tenantId = "T" + (int) (Math.random() * 100000);
        this.name = name;
        this.age = age;
        this.email = email;
        this.isRentPaid = isRentPaid;
    }

    public String getTenantId() {
        return tenantId;
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

    @Override
    public String toString() {
        return "Tenant Details: \n" +
                "tenant ID= " + tenantId + '\n' +
                "name= " + name + '\n' +
                "age= " + age + '\n' +
                "email= " + email + '\n' +
                "isRentPaid= " + isRentPaid + '\n';
    }

    public void update() {
        System.out.println("Tenant Email= " + getEmail() + ' ' +
                "Email Subject: Tenant Notified.");
    }
}
