package practice;

import java.util.Arrays;

public class codingBatZeroFront {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{0,1,1,0,1})));
    }


    public static int[] zeroFront(int[] nums) {
        int tmp = 0;
        int abc = 0;
        for(int i =0;i<nums.length;i++){
            abc++;
            if(nums[i]==0){
                nums[tmp] = nums[i];
                nums[i]=nums[abc];
                tmp++;
            }
        } return nums;
    }

}
