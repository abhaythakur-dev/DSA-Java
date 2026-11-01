import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        // MinHeap 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq.peek()); // Add
        System.out.println(pq.size()); // Size

        System.out.println(pq.remove()); // Remove 
        System.out.println(pq.peek());
        System.out.println(pq); 

        for(int ele : pq){
            System.out.print(ele+" ");
        }
    }    
}
