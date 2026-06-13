package easy;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String sorted = new String(chars);
        String sorted1 = new String(chars);
        return sorted.equals(sorted1);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagatram";
        System.out.println(isAnagram(s, t));


    }
}
