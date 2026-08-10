class Solution {

    public int inversionCount(int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}

public class CountInversion {

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 4, 1, 6, 7, 3};

        Solution s = new Solution();

        System.out.println("Inversion count = "+s.inversionCount(arr));
    }
}