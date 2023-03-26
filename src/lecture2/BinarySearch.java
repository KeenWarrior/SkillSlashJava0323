package lecture2;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 10, 15, 20};
        System.out.println(binarySearch(nums, 20));
    }

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
