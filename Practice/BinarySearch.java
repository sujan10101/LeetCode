package Practice;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean f = arr[start] < arr[end];
        System.out.println(f);

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target)
                return mid;

            if(f) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
                else
                {
                    if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

                }


//            if(f) {
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target == arr[mid]) {
//                    return mid;
//                }
//            }
//            else
//            {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//
//                } else if (target < arr[mid]) {
//                    start = mid + 1;
//                } else if (target == arr[mid]) {
//                    return mid;
//                }
//            }
        }
        return -1;

    }

    public static void main(String[] args) {
    int arr[] = {-1,0,3,5,9,12};
    int target = 9;
    int result = binarySearch(arr,target);
    System.out.print(result);
    }
}
