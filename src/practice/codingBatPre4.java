package practice;

import java.util.ArrayList;
import java.util.List;

public class codingBatPre4 {
    public static void main(String[] args) {
        pre4(new int[]{1, 2, 4, 5});
    }


    public static Object[] pre4(int[] nums) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) {
                break;

            }else{
                list.add(nums[i]);
            }
        }

        return list.toArray();

    }




}
