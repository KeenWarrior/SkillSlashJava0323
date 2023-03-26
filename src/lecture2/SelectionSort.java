package lecture2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 5, 2, 8};

//        System.out.println(findMaxByIndex(nums, 0, nums.length-2));
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int findMaxByIndex(int[] nums, int start, int end){
        int maxByIndex = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxByIndex]){
                maxByIndex = i;
            }
        }

        return maxByIndex;
    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = findMaxByIndex(nums, 0, nums.length - i - 1);
            swap(nums, index, nums.length - i - 1);
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
