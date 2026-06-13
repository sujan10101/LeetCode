package Practice;

import java.util.HashMap;

public class HashMapTutorial {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);

        int value = map.get("Apple");
        System.out.println(value);

        if(map.containsKey("Apple")){
            System.out.println(map.get("Apple"));
        }

        map.put("Apple", 10);
        System.out.println(map.get("Apple"));
    }
}
