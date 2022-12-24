package DEC_15_DEMO.customExceptions;

import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        try {
            if(sc.next().length()!=10){
                throw new ThrowingCustomExceptions("ERROR : PHONE NUMBER SHOULD BE OF 10 DIGITS");

            }
            int a =  5/sc.nextInt();
        }
        catch(ThrowingCustomExceptions e){
            System.out.println(e.getMessage());
        }
        catch(Exception a){                                             //THE LOWER CATCH BLOCK EXCEPTION SHOULD BE OF HIGHER TYPE THAN THE UPPER ONE
            a.printStackTrace();
        }
    }
}
