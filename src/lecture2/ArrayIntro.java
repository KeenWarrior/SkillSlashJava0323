package lecture2;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
//        int[] nums = new int[4];
        int[] nums = {10, 23, 11, 40};
        nums[0] = 13;

        int[] another = Arrays.copyOfRange(nums, 1, 3);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(another));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
