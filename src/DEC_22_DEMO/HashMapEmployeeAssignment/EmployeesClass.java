package DEC_22_DEMO.HashMapEmployeeAssignment;

import java.util.Objects;

public class EmployeesClass {
    private String firstName;
    private String lastName;

    public EmployeesClass() {
    }

    public EmployeesClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesClass that = (EmployeesClass) o;
        return Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "EmployeesClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
