package lecture2;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 5, 2, 8};
        System.out.println(linearSearch(nums, 11));
    }

    public static int linearSearch(int[] nums, int target){
        int lastOcc = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                lastOcc = i;
            }
        }

        return lastOcc;
    }
}
