public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

       int s=search(arr,5, 0,arr.length-1);
       System.out.println(s);

    }

    static int search(int[] arr,int target, int start, int end){

        int mid= start+(end-start)/2;

        if(arr[mid]==target)
            return mid;
        if(target>arr[mid])
            return search(arr, target, mid+1, end);
        else
            return search(arr, target, start, end-1);
    }
}
