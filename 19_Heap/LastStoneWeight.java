
import java.util.*;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to Max Heap
        for (int stone : stones) {
            pq.add(stone);
        }

        // Smash the two heaviest stones
        while (pq.size() > 1) {

            int y = pq.poll();
            int x = pq.poll();

            if (y != x) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        int result = lastStoneWeight(stones);

        System.out.println("Last Stone Weight: " + result);
    }
}
