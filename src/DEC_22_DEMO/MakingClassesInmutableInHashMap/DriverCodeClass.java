package DEC_22_DEMO.MakingClassesInmutableInHashMap;

import java.util.HashMap;
import java.util.Map;

public class DriverCodeClass {
    public static void main(String[] args) {
        Map<EmployeeClass,Integer> map = new HashMap<>();


        AddressClass ad = new AddressClass("Brampton");

        EmployeeClass e1 = new EmployeeClass("Pushpinder","Singh",ad);
        EmployeeClass e2 =  new EmployeeClass("Naman","Kumar",ad);
        EmployeeClass e3 =  new EmployeeClass("Raman","Thind",ad);

        map.put(e1,40000);
        map.put(e2,50000);
        map.put(e3,60000);

        //TO STOP THE MUTABILITY OF THE EMPLOYEE CLASS ATTRIBUTES, WE DID NOT ADDED SETTER IN THE EMPLOYEE CLASS.
        //SO,NO ONE CAN CHANGE IT ONCE AN EMPLOYEE OBJECT HAS BEEN CREATED


        e1.getAddress().setCityName("Hamilton");
        System.out.println(e1.getAddress().getCityName());
        System.out.println(map.get(e1));
        System.out.println(map);

    }
}
