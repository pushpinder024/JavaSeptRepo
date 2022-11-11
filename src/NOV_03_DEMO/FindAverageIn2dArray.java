package NOV_03_DEMO;

import java.util.Arrays;
import java.util.Random;

public class FindAverageIn2dArray {
    public static void main(String[] args) {
        int[][] array2d = new int[5][3];

        Random ranNum = new Random();
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = ranNum.nextInt(20);
            }
        }
        System.out.println(Arrays.toString(array2d[0]));
        System.out.println(Arrays.toString(array2d[1]));
        System.out.println(Arrays.toString(array2d[2]));
        System.out.println(Arrays.toString(array2d[3]));
        System.out.println(Arrays.toString(array2d[4]));

        findAverage(array2d);


    }


    public static void findAverage(int[][] a) {


        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j][i];
            }
            System.out.println("The average marks for subject " + (i+1) + " is " + (sum/a.length));
        }
    }
}