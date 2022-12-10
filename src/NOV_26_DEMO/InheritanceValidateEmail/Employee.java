package NOV_26_DEMO.InheritanceValidateEmail;

public class Employee extends Person{
    private int employeeID;
    private String emailID;
    private String designation;



    public Employee(String firstName, String lastName, int age, char gender, int employeeID, String emailID,String designation){
        super(firstName,lastName,age,gender);
        this.employeeID =  employeeID;
        this.emailID =  emailID;
        this.designation =  designation;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{firstName = " + getFirstName() + ", lastName = " + getLastName() + ", age = " + getAge() +
               ", gender = " + getGender() +
                ", employeeID=" + employeeID +
                ", emailID= " + emailID +
                ", designation = " + designation +
                '}';
    }
    public void work(){
        System.out.println("This employee works");
    }



}
