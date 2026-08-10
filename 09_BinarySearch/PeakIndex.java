public class PeakIndex {
    public static int peakIndex(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) {

                lo = mid + 1;
            } else {

                hi = mid;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 8, 2 };
        System.out.println("Peak Index = " + peakIndex(arr));
    }
}