public class SwapNodesInPairs {

    public static Node swapPairs(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node first = head;
        Node second = head.next;

        // Swap first pair
        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }

    public static void printList(Node t) {

        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
         head.next.next.next.next.next = new Node(6);
        System.out.print("Before = ");
        printList(head);

        head = swapPairs(head);

        System.out.print("After = ");
        printList(head);
    }
}
