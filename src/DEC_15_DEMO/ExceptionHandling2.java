package DEC_15_DEMO;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String s = null;

        try {
            System.out.println(a/b);                     // Arithmetic Exception
            System.out.println(s.trim());                // Null Pointer Exception
            int c =  Integer.parseInt("Pushpinder");  // Number Format Exception
        }

        catch(Exception are){
            System.out.println("Arithmetic Exception");
            are.printStackTrace();
        }
        finally{
            System.out.println(a/b);
        }


        System.out.println("abc");
        System.out.println("xyz");

    }
}
