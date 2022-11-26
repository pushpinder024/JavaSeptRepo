package practice;

import java.util.ArrayList;
import java.util.List;

public class codingBatPost4 {
    public static void main(String[] args) {
        System.out.println(post4(new int[]{1, 2, 3, 4, 4,6,7,8,4,5, 6}));
    }


    public  static int[] post4(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] == 4) {
                for (int j = i+1; j < nums.length; j++) {
                    list.add(nums[j]);


                }break;
            }
        }


        int[] nums2 = new int[list.size()];
        for(int k = 0;k<list.size();k++){
            nums2[k] = list.get(k);
        }
        return nums2;
    }

}
