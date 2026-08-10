import java.util.Scanner;

public class SearchRotatedSortedArray {

    public static int search(int[] arr, int tar) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {
                return mid;
            }

            // Left half is sorted
            if (arr[lo] <= arr[mid]) {

                if (arr[lo] <= tar && tar < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (arr[mid] < tar && tar <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int tar = sc.nextInt();

        int ans = search(arr, tar);

        System.out.print("Index = " + ans);

        sc.close();
    }
}
    

