package Practice;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int k = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if((nums[i] + nums[i+1]) == target){
                arr[k] = i;
                arr[k+1] = i+1;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // nums = [3, 0, 3], target = 3 (since 0+3=3)
        int[] nums = {3, 0, 3};
        int target = 6;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        System.out.print("Indices: [");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

