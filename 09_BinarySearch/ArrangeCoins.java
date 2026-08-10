public class ArrangeCoins {

    public static int sqrt(long n) {

        if (n == 0)
            return 0;

        long lo = 1;
        long hi = n;

        while (lo <= hi) {

            long mid = lo + (hi - lo) / 2;

            if (mid == n / mid)
                return (int) mid;
            else if (mid > n / mid)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        return (int) hi;
    }

    public static int arrangeCoins(int n) {

        long m = (long) n;

        return (sqrt(8 * m + 1) - 1) / 2;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Complete Rows = " + arrangeCoins(n));
    }
}
