package DEC_17_DEMO.CollectionsFramework.CollectionsFrameworkPractice;

import java.util.Comparator;
import java.util.Objects;

public class TheEmployees implements Comparable {
    private String empID;
    private String firstName;
    private String lastName;
    private String salary;
    private String phoneNo;

    public TheEmployees(String empID, String firstName, String lastName, String salary, String phoneNo) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.phoneNo = phoneNo;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    @Override
    public String toString() {
        return "TheEmployees{" +
                "empID='" + empID + '\'' +
                "\n , firstName='" + firstName + '\'' +
                "\n , lastName='" + lastName + '\'' +
                "\n , salary='" + salary + '\'' +
                "\n , phoneNo='" + phoneNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheEmployees that = (TheEmployees) o;
        return Objects.equals(getEmpID(), that.getEmpID());
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(getEmpID(), getFirstName(), getLastName(), getSalary(), getPhoneNo());
//    }
    @Override
    public int compareTo(Object o) {

        return -1;
    }
}

