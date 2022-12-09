package NOV_19_DEMO;

public class stringBuilderANDstringBuffer {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Push");                //NOT THREAD SAFE
        a.append("pin");
        a.append("der S");
        a.append("ingh ");
        a.append(1);
        System.out.println(a);


        StringBuffer b = new StringBuffer("Push");                  //THREAD SAFE
        b.append("pin");
        b.append("der S");
        b.append("ingh ");
        b.append(1);
        System.out.println(b);
    }
}
