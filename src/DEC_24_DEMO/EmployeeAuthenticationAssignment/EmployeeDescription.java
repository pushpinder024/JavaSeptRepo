package DEC_24_DEMO.EmployeeAuthenticationAssignment;

import java.util.Objects;

public class EmployeeDescription {
    private String firstName;
    private String lastName;
    private EmployeeAddress address;

    public EmployeeDescription() {
    }

    public EmployeeDescription(String firstName, String lastName, EmployeeAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeDescription{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDescription that = (EmployeeDescription) o;
        return getFirstName().equals(that.getFirstName()) && getLastName().equals(that.getLastName()) && getAddress().equals(that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAddress());
    }
}
