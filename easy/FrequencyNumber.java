package easy;

public class FrequencyNumber {

    public static void frequencyOfNumber(int[] arr){

        int[] newArr = new int[7];
        for(int i = 0; i < arr.length; i++)
        {
            newArr[i] = -1;
        }

        for(int i = 0; i < arr.length; i++)
        {
            int c = 1;
            for(int j = i+1; j < arr.length; j++)
            {
               if(arr[i] == arr[j])
               {
                   c = c + 1;
                   newArr[j] = 0;
               }

               if(newArr[i] != 0){
                   newArr[i] = c;
               }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(newArr[i] != 0){
                System.out.println("Number :" + " " + arr[i] + "," + newArr[i]);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 7, 5, 5, 2};
        frequencyOfNumber(arr);
    }
}
