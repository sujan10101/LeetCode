package Practice;

public class Palidrome {

    public static void main(String[] args) {
        String s = "abb";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }


    /*
    *
    * a  0
    * b  1
    * a  2
    * b  3
    * a  4
    *
    * */
    private static boolean isPalindrome(String s) {

        boolean isPalindrome = true;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i)!= s.charAt(s.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }
}
