package NOV_03_DEMO;

import java.util.Arrays;

public class Array2dDemo {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5}, {6, 8, 7, 8, 9}};
        System.out.println(Arrays.toString(array1[0]));

        System.out.println(array1.length);

        for (int i = 0; i < array1.length; i++) {
            int sum =0;
            for (int j = 0; j < array1[0].length; j++) {
                sum = sum + array1[i][j];
            }
            System.out.println("The total marks for subject " + (i+1) +" for all students is " + sum  );


        }





        for(int i=0;i< array1[0].length;i++) {
            int sum = 0;

            for (int j = 0; j < array1.length; j++) {
                sum = sum + array1[j][i];
            }
            System.out.println("The total marks for subject " + (i + 1) + " is " + sum);
        }
    }
}
