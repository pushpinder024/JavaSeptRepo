package DEC_24_DEMO.InnerClass2;

public class MainDriver {
    public static void main(String[] args) {
        EmployeeInterface e1 = new EmployeeInterface() {
            @Override
            public void quit() {
                System.out.println("The Employee has left the comapany. \nPlease remove him from the database.");
            }
        };
        e1.quit();
    }
}
