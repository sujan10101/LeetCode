package Practice;

class Anagram {
    public static boolean isAnagram(String s, String t) {
        // Quick length check
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // for 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                System.out.println(freq[i]);
            }
        }

        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Boolean s = isAnagram("suja", "ajbu");
        System.out.println(s);
    }
}
