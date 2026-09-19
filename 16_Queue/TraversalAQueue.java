
import java.util.Queue;
import java.util.LinkedList;

public class TraversalAQueue{
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // Front 
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50); // Rear

        display(q);

        addAtIndex(q,5 ,60);
        display(q);

    }
    private static void addAtIndex(Queue<Integer> q, int idx , int val){
        if(idx<0 || idx> q.size()){
            System.out.println("Invalid Index ");
            return;
        }
        int n = q.size();
        for(int i=1;i<=idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
    }

    private static int peek(int idx){
        return -1; // complete ur self
    }

    private static int remove(int idx){
        return -1; // complete ur self
    }
}