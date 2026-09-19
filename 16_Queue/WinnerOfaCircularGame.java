import java.util.*;

public class WinnerOfaCircularGame {
    public static void main(String[] args) {

        int n = 5;
        int k = 2;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);

        while (q.size() > 1) {

            // k-1 elements remove and add back
            for (int i = 1; i <= k - 1; i++) {
                q.add(q.remove());
            }

            // kth element remove
            q.remove();
        }

        System.out.println("Winner: " + q.peek());
    }
}