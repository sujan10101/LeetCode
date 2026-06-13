package Practice;

public class LongestPalindromeString {

    static int resultStart = 0;
   static int resultLength = 0;

    public static String longestPalindrome(String s) {
        int strLength = s.length();
        if(strLength < 2){
            return s;
        }
        
        for(int start = 0; start < s.length(); start++){
            expandRange(s, start, start);
            expandRange(s, start, start+1);
        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    private static void expandRange(String s, int begin, int end) {

        while(begin >= 0 &&  end < s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }

        if(resultLength < end - begin - 1){
            resultLength = end - begin - 1;
            resultStart = begin + 1;
        }

    }


    public static void main(String[] args) {
      String s = "cbbd";
      String s1 = longestPalindrome(s);
      System.out.println(s1);

    }
}

