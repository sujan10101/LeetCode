package Practice;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int nums[] =  {5,7,7,8,8,8,10};
        int target = 8;

        int ans[] = {0,0};

        ans[0] = firstIndex(nums,target);

        System.out.println(ans[0]);
        System.out.println(ans[1]);



    }

    private static int firstIndex(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if ( target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                start = mid + 1;

            }
        }
        return ans;


    }

}
