package NOV_26_DEMO.EncapsulationDemo;

public class StudentDemo {
    private int StudentId;
    private String firstName;
    private String lastName;
    private StudentAddress studentAddress;
    private String emailId;
    private String phoneNumber;

    public StudentDemo(int studentId, String firstName, String lastName, StudentAddress studentAddress, String emailId, String phoneNumber) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAddress = studentAddress;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
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

    public StudentAddress getAddress() {
        return studentAddress;
    }

    public void setAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "StudentId=" + StudentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentAddress=" + studentAddress +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
