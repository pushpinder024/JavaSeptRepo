package DEC_22_DEMO.HashMapEmployeeAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DriverCode {
    public static void main(String[] args) {
        Map<EmployeesClass, Integer> HashmapOfEmployees = new HashMap<>(50, 80);
        EmployeesClass e1 = new EmployeesClass("Pushpinder", "Singh");
        EmployeesClass e2 = new EmployeesClass("Naman", "Kumar");
        EmployeesClass e3 = new EmployeesClass("Abhinav", "Juneja");
        EmployeesClass e4 = new EmployeesClass("Nikhil", "Salaria");
        EmployeesClass e5 = new EmployeesClass("Karan", "Sharma");
        EmployeesClass e6 = new EmployeesClass("John", "Smith");
        EmployeesClass e7 = new EmployeesClass("Peter", "Parker");
        EmployeesClass e8 = new EmployeesClass("Andy", "Singh");

        insertionToMap(e1, HashmapOfEmployees, 51000);
        insertionToMap(e2, HashmapOfEmployees, 52000);
        insertionToMap(e3, HashmapOfEmployees, 53000);
        insertionToMap(e4, HashmapOfEmployees, 54000);
        insertionToMap(e5, HashmapOfEmployees, 55000);
        insertionToMap(e6, HashmapOfEmployees, 56000);
        insertionToMap(e7, HashmapOfEmployees, 57000);
        System.out.println(HashmapOfEmployees);


        doubleTheSalary(HashmapOfEmployees, e6);
        doubleTheSalary(HashmapOfEmployees, e7);
        System.out.println(HashmapOfEmployees);


    }

    public static void insertionToMap(EmployeesClass employeeObject, Map<EmployeesClass, Integer> employeeHashmap, Integer Salary) {
        employeeHashmap.put(employeeObject, Salary);
    }


    public static void doubleTheSalary(Map<EmployeesClass, Integer> HashmapOfEmployees, EmployeesClass e) {
        Set<Map.Entry<EmployeesClass, Integer>> employeeNameAndSalarySet = HashmapOfEmployees.entrySet();
        Iterator<Map.Entry<EmployeesClass, Integer>> employeeIterator = employeeNameAndSalarySet.iterator();

        while (employeeIterator.hasNext()) {
            Map.Entry<EmployeesClass, Integer> employeeNextObject = employeeIterator.next();

            if (employeeNextObject.getKey().equals(e)) {
                HashmapOfEmployees.put(e, employeeNextObject.getValue() * 2);


            }
        }


    }
}

