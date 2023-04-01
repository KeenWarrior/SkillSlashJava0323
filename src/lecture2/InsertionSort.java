package lecture2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {30 ,8,6,7,1};

        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums){

        for (int index = 0; index < nums.length - 1; index++) {
            for (int prev = index + 1; prev > 0 ; prev--) {
                if(nums[prev] < nums[prev-1]){
                    swap(nums, prev, prev-1);
                } else {
                    break;
                }
            }
        }
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
