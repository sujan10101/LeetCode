package Practice;

public class ErrBinarySearch {

    public static void main(String[] args) {
        int[] arr= {-1,0,3,5,9,12};
        int target = 9;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static  int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;


        while(start <= end){

            int mid = start + (end - start)/2;
            System.out.println("Mid Element " + mid);


            if(nums[mid] == target)
                return mid;

            if(nums[mid] > target){
                end = mid - 1;

            }
            else{
                start = mid + 1;

            }

        }
        return -1;
    }
}
