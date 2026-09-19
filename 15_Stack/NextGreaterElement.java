import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {

    public static ArrayList<Integer> nextGreaterElement(int[] arr) {

        int n = arr.length;

        int[] nge = new int[n];
        nge[n - 1] = -1;

        Stack<Integer> st = new Stack<>();

        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(nge[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};

        ArrayList<Integer> ans = nextGreaterElement(arr);

        System.out.print("Array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Next Greater Elements = ");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}