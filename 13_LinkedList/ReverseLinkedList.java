public class ReverseLinkedList {

    public static Node reverseList(Node head) {

        // Using 3 Pointer 
        // previous 
        // current 
        // next
        

        Node curr = head;
        Node prev = null;
        Node fwd = null;

        while (curr != null) {

            fwd = curr.next;
            curr.next = prev;

            prev = curr;
            curr = fwd;
        }

        return prev;
    }

    public static void printList(Node t) {

        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before:");
        printList(head);

        head = reverseList(head);

        System.out.println("After:");
        printList(head);
    }
}
