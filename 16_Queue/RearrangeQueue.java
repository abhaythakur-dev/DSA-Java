import java.util.*;

public class RearrangeQueue {

    public static Queue<Integer> rearrangeQueue(Queue<Integer> q) {

        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();

        // First half ko q2 mein store karo
        for (int i = 1; i <= n / 2; i++) {
            q2.add(q.remove());
        }

        // First half + second half ko alternate karo
        while (q2.size() > 0) {
            q.add(q2.remove());
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Original Queue: " + q);

        q = rearrangeQueue(q);

        System.out.println("Rearranged Queue: " + q);
    }
}