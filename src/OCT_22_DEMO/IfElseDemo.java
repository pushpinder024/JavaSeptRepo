package OCT_22_DEMO;

public class IfElseDemo {
    public static void main(String[] args) {

        evenOdd(0);
    }



    public static void evenOdd(int number){
        if(number==0){
            System.out.println("The number is neutral.");
        }
         else if(number%2==0){
            System.out.println("It's an even number.");
        } else{
            System.out.println("It's an odd number.");
        }
    }
}
