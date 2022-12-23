package practice;

public class class1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        System.out.println(a / b);

       try {
           System.out.println(a / b);
       }
       catch(ArithmeticException exc){
           exc.printStackTrace();
       }
       finally {
           System.out.println("Done");
       }

        System.out.println("abc");
        System.out.println("xyz");
    }
}
