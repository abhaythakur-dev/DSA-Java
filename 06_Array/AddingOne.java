import java.util.*;

public class AddingOne {

    public static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();

        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;

            ans.add(sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 9, 9, 9 };

        Vector<Integer> result = addOne(arr);

        System.out.println(result);
    }
}