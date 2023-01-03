package DEC_24_DEMO.EmployeeAuthenticationAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args) {
        Map<EmployeeDescription, String> employeeList = new HashMap<>();


        Scanner sc = new Scanner(System.in);

        EmployeeDescription e1;
        EmployeeAddress address;

        String password ;
        System.out.println("Do you want to continue : YES or NO");
        String validate = sc.next();


        while (validate.equals("YES")) {
            System.out.println("What operation do you want to perform :");
            System.out.println("Press 1 for registration \nPress 2 for login \nPress 3 for Password Update\nPress 4 for to exit");

            int choice = sc.nextInt();
            switch (choice) {


                case 1:
                    e1 = new EmployeeDescription();
                    address = new EmployeeAddress();

                    System.out.println("Please enter the first name of the employee");
                    e1.setFirstName(sc.next());

                    System.out.println("Please enter the last name of the employee");
                    e1.setLastName(sc.next());

                    System.out.println("Please enter the following fields one by one : Street Number, Street Name, City Name, Province, Country");
                    address.setStreetNo(sc.next());
                    address.setStreetName(sc.next());
                    address.setCityName(sc.next());
                    address.setProvince(sc.next());
                    address.setCountry(sc.next());
                    e1.setAddress(address);

                    System.out.println("Please enter the password you want to register with");
                    password = sc.next();
                    employeeList.put(e1, password);
                    break;


                case 2:
                    e1 = new EmployeeDescription();
                    address = new EmployeeAddress();

                    System.out.println("Please enter the first name");
                    e1.setFirstName(sc.next());

                    System.out.println("Please enter the last name");
                    e1.setLastName(sc.next());

                    System.out.println("Please enter the following fields one by one : Street Number, Street Name, City Name, Province, Country");
                    address.setStreetNo(sc.next());
                    address.setStreetName(sc.next());
                    address.setCityName(sc.next());
                    address.setProvince(sc.next());
                    address.setCountry(sc.next());
                    e1.setAddress(address);


                    if (employeeList.containsKey(e1)) {
                        System.out.println("Please enter your password");
                        if (employeeList.get(e1).equals(sc.next())) {
                            System.out.println("Your login credentials are correct.\nYou are logged in successfully :)");

                        } else {
                            System.out.println("Your login credentials do not match.\nTry again later :(");
                        }
                    } else {
                        System.out.println("Error: Employee does not exist");
                    }
                    break;

                case 3:
                    e1 = new EmployeeDescription();
                    address =  new EmployeeAddress();

                    System.out.println("Please enter the first name");
                    e1.setFirstName(sc.next());

                    System.out.println("Please enter the last name");
                    e1.setLastName(sc.next());

                    System.out.println("Please enter the following fields one by one : Street Number, Street Name, City Name, Province, Country");
                    address.setStreetNo(sc.next());
                    address.setStreetName(sc.next());
                    address.setCityName(sc.next());
                    address.setProvince(sc.next());
                    address.setCountry(sc.next());
                    e1.setAddress(address);

                    if (employeeList.containsKey(e1)) {
                        System.out.println("Please enter your password");
                        if (employeeList.get(e1).equals(sc.next())) {
                            System.out.println("Please enter your new password: ");
                            employeeList.put(e1, sc.next());
                            System.out.println("Your password has been updated.");

                        } else {
                            System.out.println("Your login credentials do not match.\nTry again later :(");
                        }
                    } else {
                        System.out.println("Error: Employee does not exist");
                    }
                    break;
                case 4:
                    break;


            }

            System.out.println("Do you want to perform any other operation: YES or NO");
            validate = sc.next();

        }
        System.out.println(employeeList);
    }
}