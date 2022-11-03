package OCT_22_DEMO;

public class findLargest {
    public static void main(String[] args) {
        method1(3, 3, 2);
        method2(true);
    }

    public static void method1(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " IS THE GREATEST NUMBER OF ALL.");
        } else if (b >= c && b >= a) {
            System.out.println(b + " IS THE GREATEST NUMBER OF ALL.");
        } else {
            System.out.println(c + " IS THE BIG  NUMBER OF ALL.");
        }

    }


    public static void method2(boolean isActive){
        if(isActive){
            System.out.println(isActive);
        } else {
            System.out.println(isActive);
        }
    }
}
