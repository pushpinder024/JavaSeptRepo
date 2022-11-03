package OCT_29_DEMO;

public class ContinueBreakDemo {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("START " +i);
            if(i==5 || i==6){
                continue;
            }
            System.out.println("END "+i);
            System.out.println("HI");
        }
    }
}
