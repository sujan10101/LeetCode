package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequent {

    private int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
      for(int i = 0; i < nums.length; i++){


          if(map.containsKey(nums[i])){
              c++;
          }

          map.put(i, nums[i]);
      }
        System.out.println(c);

      return new int[0];
    }


    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        TopKFrequent sol = new TopKFrequent();
        int[] result = sol.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }


}
