package practice;

public class xyBalancedCodingBat {
    public static void main(String[] args) {
        reverseStringMethod("breadjambreadyyy");

    }


    public static void reverseStringMethod(String str) {
        char[] array1 = str.toCharArray();
        int start = 0;
        int end = array1.length - 1;
        char temp;
        while (start < end) {
            temp = array1[end];
            array1[end] = array1[start];
            array1[start] = temp;
            start++;
            end--;
        }
        String stringstr = new String(array1);
//        System.out.println(stringstr);

        int bread1 = str.indexOf("bread");
        int bread2 = stringstr.indexOf("dearb");
        int bread2real = stringstr.length()-bread2;
        int bread2Index = stringstr.length() -bread2-bread2real;
//        if(str.length()<=10){
//            return "";
//        }

        if (str.contains("bread")) {
            System.out.println(str.substring(bread1 + 5, bread2Index));
//        }return "";
        }


    }
}

