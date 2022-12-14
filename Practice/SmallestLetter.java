package Practice;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = { 'a', 'b','c'};
        char target = 'c';


        char answer = nextGreatestLetter(letters, target);
        System.out.print(answer);
    }

    private static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start+ (end-start)/2;

            System.out.println("target ::" + target);
            System.out.println("Letters ::" + letters[mid]);
            if(target > letters[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }
        return letters[start % letters.length];


    }
}
