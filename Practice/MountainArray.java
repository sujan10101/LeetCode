package Practice;

public class MountainArray {


    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int start = 0;
        int end = arr.length - 1;
        int answer = mountain(arr, start, end);
        System.out.println(answer);


    }

    private static int mountain(int[] arr, int start, int end) {

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;

            }
        }

    return start;
    }

}
