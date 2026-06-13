package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {


    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String , List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){


            String str = strs[i];
            int[] newArr = new int[26];

           for(int j = 0; j < str.length(); j++)
           {
               newArr[str.charAt(j) - 'a']++;
           }
           StringBuilder appendStr = new StringBuilder();

           for(int k = 0; k < newArr.length; k++){
               appendStr.append(newArr[k]).append("#");
           }

           String key = appendStr.toString();
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(str);


        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        GroupAnagram sol = new GroupAnagram();
        List<List<String>> result = sol.groupAnagrams(strs);

        System.out.println(result);
    }
}
