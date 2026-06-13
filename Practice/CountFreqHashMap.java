package Practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountFreqHashMap {

    private int countFrequency(int[] nums, int k) {

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//
//            if (map.containsKey(nums[i])) {
//                int count = map.get(nums[i]);
//                map.put(nums[i], count + 1);
//            }
//            else {
//                map.put(nums[i], 1);
//            }
//
//        }
//        System.out.println(map);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> [] bucketList = new List[nums.length + 1];

        for(int key: map.keySet() ){
             int freq = map.get(key);
             if(bucketList[freq] == null){
                 bucketList[freq] = new ArrayList<>();
             }

             bucketList[freq].add(key);
        }

        int[] newArr = new int[k];
        int index = 0;
        for(int l = bucketList.length - 1; l >= 0; l--){

            if(bucketList[l] == null){
                continue;
            }

            for(int m = 0 ; m < bucketList[l].size() && index < k; m++){
                newArr[index] = bucketList[l].get(m);
                index++;
            }


        }

//        return newArr;

        System.out.println(newArr);

        System.out.println(bucketList);


        System.out.print(map);
        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        CountFreqHashMap sol = new CountFreqHashMap();
        int result = sol.countFrequency(nums, k);

        System.out.println(result);
    }


}
