package easy;

public class Reverse {

    public static int reverse(int x) {
        int j = x;
        int h = 0;
        while( x != 0 ){
            int a = x % 10;
            if( h > Integer.MAX_VALUE/10 || h < Integer.MIN_VALUE/10 ) return 0;
            h = h * 10 + a;
            x = x / 10;
        }
        return h;
    }


    public static void main(String[] args) {
        int u = reverse(1534236469);
        System.out.println(u);
    }
}
