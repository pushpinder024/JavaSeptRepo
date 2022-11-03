package OCT_22_DEMO;

public class monthCalculator {
    public static void main(String[] args) {
        calculate(4);
    }

    public static void calculate(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("THIS MONTH HAS 31 DAYS");
        } else if (month == 2) {
            System.out.println("THIS MONTH HAS 28 DAYS");
        } else {
            System.out.println("THIS MONTH HAS 30 DAYS");
        }
    }
}
