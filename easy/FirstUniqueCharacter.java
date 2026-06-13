package easy;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            int c = 0;
            for (int j = i + 1; j < s.length(); j++) {

                if(s.charAt(i) == s.charAt(j)) {
                    c= c+1;
                }

            }
            System.out.println(s.charAt(i));
            System.out.println(c);

        }

  return  0;
    }

    public static void main(String[] args) {
        String s = "loveleetcode"; // 2
        String s1 = "leetcode";  // 0

        int[] newArr = new int[s.length()];
        for(int i = 0 ; i < s.length(); i++)
        {
            newArr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int c = 1;
            for (int j = i + 1; j < s.length(); j++) {

                if(s.charAt(i) == s.charAt(j)) {
                    c= c+1;
                    newArr[j] = 0;
                }

                if(newArr[i]!=0){
                    newArr[i] = c;
                }

            }

        }


        for(int i = 0; i < s.length(); i++)
        {
            if(newArr[i] != 0){
                System.out.println("Number :" + " " + s.charAt(i) + "," + newArr[i]);
            }
        }


//        System.out.println(firstUniqChar(s));
    }

}
