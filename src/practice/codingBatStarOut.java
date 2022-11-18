package practice;

import java.util.Arrays;

public class codingBatStarOut {
    public static void main(String[] args) {
        byte[] bytes = new byte[3]; // byte array
        bytes[0] =80;
        bytes[1] =80;
        bytes[2] = 80;

        char[] convertedChar = new char[bytes.length];
        for(int i=0;i < bytes.length;i++){
            convertedChar[i]=(char)bytes[i];
        }
        System.out.println(Arrays.toString(convertedChar));
        String charArray = new String(convertedChar);
        System.out.println(charArray);
    }
}
