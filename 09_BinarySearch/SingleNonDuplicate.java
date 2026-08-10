public class SingleNonDuplicate {
    public static int findSingle(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) {
                mid--;

            }
            if (arr[mid] == arr[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }
        return arr[lo];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        System.out.println("Single Element = " + findSingle(arr));

    }
}
