import java.util.Arrays;

public class TwoSumPair{

    static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return true;
            } 
            else if (sum > target) {
                j--;
            } 
            else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 22;

        if (twoSum(arr, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}