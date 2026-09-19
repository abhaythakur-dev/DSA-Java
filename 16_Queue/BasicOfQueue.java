import java.util.Queue;
import java.util.LinkedList;

public class BasicOfQueue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // Front 
        q.add(20);
        q.add(30);
        q.add(40); // Rear

        // Peek
        System.out.println(q+" "+q.peek());

        // Remove
        q.remove();
        System.out.println(q+" "+q.size());

        // Add
        q.add(50);
        System.out.println(q);

    }
}