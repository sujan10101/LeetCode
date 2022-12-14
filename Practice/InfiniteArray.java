package Practice;

public class InfiniteArray {



    public static void main(String[] args) {
        int[] arr= {2,3,5,6,7,8,9,10,11,12,13};
        int target = 7;

        int ans = answer(arr,target);
        System.out.println(ans);

    }

    private static int answer(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while(target > arr[end]){
           int newStart = end + 1;

           end = end + (end - start + 1) * 2;

           start = newStart;

        }
        int ans = binarySearch(arr,target,start, end);
        return ans;

    }

    public static int binarySearch(int arr[], int target , int start , int end)
    {
        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;


    }
}
