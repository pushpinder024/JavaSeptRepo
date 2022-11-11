package NOV_03_DEMO;

import java.util.Random;

public class highestScore {
    public static void main(String[] args) {
        int[][] array1 = new int[2][5];
        System.out.println(array1.length);


        Random randoms = new Random();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = randoms.nextInt(50);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        for (int i = 1; i <= array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                int maxNum = Math.max(max, array1[0][j]);
                max = maxNum;
            }
            System.out.println("Highest mark attained by student 1 in any subject is " + max);
        }


    }
}
