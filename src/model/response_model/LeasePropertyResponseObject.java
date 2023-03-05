package model.response_model;

import model.lease.Lease;
import model.property.Property;

public class LeasePropertyResponseObject {

    private final Lease lease;
    private final Property property;

    public LeasePropertyResponseObject(Lease lease, Property property) {
        this.lease = lease;
        this.property = property;
    }

    @Override
    public String toString() {
        return "-------------------------" +
                "lease= " + lease +
                ", property= " + property +
                "------------------------";
    }
}
