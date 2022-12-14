package Practice;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Ceiling {

    public static void main(String[] args) {
        int arr[]= {2,3,5,9,14,15,15,16,18};
        int target = 16;

        int index = ceilingIndex(arr, target);
        System.out.println(index);

    }

    private static int ceilingIndex(int[] arr, int target) {
     int start = 0;
     int end = arr.length - 1;

     while(start <= end){
         int mid = start + (end - start)/2;

         if(target < arr[mid]) {
         end = mid - 1;
         }
         else if(target > arr[mid]){
             start = mid + 1;
         }
         else{
             start = mid + 1;
         }
     }
     return start;

    }
}

