package OCT_27_DEMO;

import java.sql.SQLOutput;

public class doubleForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
