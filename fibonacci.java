public class fibonacci {
    public static void main(String[] args) {
        int ans= fibo(4);
        System.out.println(ans);
    }

    private static int fibo(int i) {
        if(i<2)
            return i;
        return fibo(i-1)+fibo(i-2);
    }
}
