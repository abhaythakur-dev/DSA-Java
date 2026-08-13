
public class PartitionLinkedList {
    public static Node partition(Node head, int x){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node t = head;

        while(t!= null){
            if(t.val<x){
                t1.next = t;
                t1 = t1.next;
            }
            else{
                 t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;

    }
    public static void printList(Node t) {
   

    while (t != null) {
        System.out.print(t.val + " -> ");
        t = t.next;
    }

    System.out.println("null");
}

public static void main(String[] args) {

    // 2 -> 4-> 3 -> 5-> 1 -> 6 ->

    Node head = new Node(2);
    head.next = new Node(4);
    head.next.next = new Node(3);
    head.next.next.next = new Node(5);
    head.next.next.next.next = new Node(1);
    head.next.next.next.next.next = new Node(6);
  

    System.out.println("Before:");
    printList(head);
    
    int x = 3;

    head = partition(head, x);

    System.out.println("After:" +" ");
    printList(head);
}

}
