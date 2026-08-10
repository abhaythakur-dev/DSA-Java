public class FloorInSortedArray {

    public static int floor(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        if (target < arr[0]) {
            return -1;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                idx = mid;
                high = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14,14, 16, 18};
        int target = 15;
        System.out.println("Floor = " + floor(arr, target));
    }
}