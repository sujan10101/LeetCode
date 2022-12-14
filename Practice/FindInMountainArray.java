package Practice;

public class FindInMountainArray {

    public static int peakIndex(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mountainArr[mid] < mountainArr[mid+1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearchStraight(int[] mountainArr, int target, int start, int end){


        while(start <= end){
            int mid = start + (end - start)/2;

            if(mountainArr[mid] < target){
                start = mid + 1;
            }
            else if(mountainArr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

    public static int binarySearchAgnostic(int[] mountainArr, int target, int start, int end){


        while(start <= end){
            int mid = start + (end - start)/2;


            if(mountainArr[mid] < target){
                end = mid - 1;

            }
            else if(mountainArr[mid] > target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] mountainArr = {0,5,3,1};
        int target = 1;
        int peak = peakIndex(mountainArr);


        int firstTry = binarySearchStraight(mountainArr, target , 0, peak);

        if(firstTry != -1){
            System.out.println(firstTry);
        }

        if(firstTry == -1){

            int secondTry = binarySearchAgnostic(mountainArr, target, peak+1, mountainArr.length-1);

            System.out.println(secondTry);
        }


    }
}
