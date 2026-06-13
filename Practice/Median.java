package Practice;

public class Median {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4};

        printMedian(arr1, arr2);

    }

    private static void printMedian(int[] arr1, int[] arr2) {

      int m = arr1.length;
      int n = arr2.length;

      int i = 0;
      int j = 0;

      int[] arr3 = new int[m+n];
      int k = 0;

      while( i < m && j < n){

          if(arr1[i] < arr2[j]){
              arr3[k++] = arr1[i++];
          }
          else
          {
              arr3[k++] = arr2[j++];
          }

      }

      while(i < m){
          arr3[k++] = arr1[i++];
      }

      while(j < n){
          arr3[k++] = arr2[j++];
      }


      for(int l = 0; l < (m+n); l++){
          System.out.println(arr3[l]);
      }

    }
}
