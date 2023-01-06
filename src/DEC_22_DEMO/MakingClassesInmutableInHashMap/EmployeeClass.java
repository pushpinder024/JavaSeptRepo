package DEC_22_DEMO.MakingClassesInmutableInHashMap;

import java.util.Objects;

public class EmployeeClass {
    private String FirstName;
    private String lastName;
    private AddressClass address;

    public EmployeeClass(String firstName, String lastName, AddressClass address) {
        FirstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }



    public AddressClass getAddress() {
        AddressClass clonedAddress = new AddressClass(address.getCityName());
        return clonedAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return Objects.equals(FirstName, that.FirstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, lastName, address);
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
