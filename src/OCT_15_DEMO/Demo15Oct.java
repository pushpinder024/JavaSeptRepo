package OCT_15_DEMO;

public class Demo15Oct {
    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(multiply(5, 5));
        System.out.println(divide(123123, 441442));
        System.out.println(subtract(10, 4));
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
