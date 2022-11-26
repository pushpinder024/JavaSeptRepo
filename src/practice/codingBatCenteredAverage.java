package practice;

public class codingBatCenteredAverage {
    public static void main(String[] args) {

        int[] array1 = {7,7,7};
        System.out.println(centeredAverage(array1));
    }




    public static int centeredAverage(int[] nums) {
        int max = 0;
        int min = 0;
        int max1= nums[0];
        int min1 = nums[0];
        int len = nums.length-2;


        for(int i =0; i<nums.length;i++){
            max = Math.max(max1,nums[i]);
            max1 = max;
            min = Math.min(min1,nums[i]);
            min1 = min;
        }

        int sum = 0;

        for(int j = 0; j<nums.length;j++){
            sum  = sum + nums[j];
        }
        return (sum - min1 - max1)/len;

    }
}
