package easy;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + nums[i + 1] == target) {
                return new int[] {i, i + 1};
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
