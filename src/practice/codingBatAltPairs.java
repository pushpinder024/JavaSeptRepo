package practice;

public class codingBatAltPairs {
    public static void main(String[] args) {
        altPairs("CodingHorror");
        //congrr
    }



    public static String altPairs(String str) {
        String s = "";
        for (int i =1;i<str.length();i++){
            s = s   + str.charAt(i);

            if((i+3) < str.length()){
                i=(i+3);
                s = s + str.charAt(i);}
        }
        System.out.println(s);
        return s;
    }
}
