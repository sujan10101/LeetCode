package Practice;

import static Practice.ErrBinarySearch.search;

public class PivotElement {

    public static void main(String[] args) {

        int[] arr = {4,1,2,2,3,3,3};
        int target = 3;

        int answer = search1(arr, target);
        System.out.println(answer);


    }

    private static int search1(int[] arr, int target) {
        int pivotIndex = findPivotIndex(arr);


        if(pivotIndex == -1){
            return binarySearch(arr,target,0, arr.length-1);
        }

        if(arr[pivotIndex] == target){
            return pivotIndex;
        }

        else if( target >= arr[0]){
            return binarySearch(arr,target,0, pivotIndex-1);

        }
        else{
            return binarySearch(arr,target, pivotIndex+1 , arr.length-1);
        }
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }

    private static int findPivotIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            else if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;

    }
}
