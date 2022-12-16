package NOV_26_DEMO;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {




        System.out.println(new String(reverseString("Pushpinder")));

    }

    public static char[] reverseString(String name) {

        char[] name1 = name.toCharArray();

        int start = 0;
        int end = name1.length - 1;
        char temp;
        while (start < end) {

            temp = name1[end];
            name1[end] = name1[start];
            name1[start] = temp;
            start++;
            end--;

        }
        return name1;
    }
}
