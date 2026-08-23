public class ReverseASubList {

    // Reverse LinkedList
    public static void reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node fwd = null;

        while (curr != null) {

            fwd = curr.next;
            curr.next = prev;

            prev = curr;
            curr = fwd;
        }
    }

    // Reverse between l and r
    public static Node reverseBetween(int l, int r, Node head) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        dummy.next = head;

        // Move temp to node before l
        for (int i = 1; i <= l - 1; i++) {
            temp = temp.next;
        }

        Node tail1 = temp;
        Node head2 = temp.next;

        // Move temp to rth node
        for (int i = 1; i <= r - l + 1; i++) {
            temp = temp.next;
        }

        Node tail2 = temp;
        Node head3 = temp.next;

        // Break the three parts
        tail1.next = null;
        tail2.next = null;

        // Reverse middle part
        reverse(head2);

        // Connect the three parts
        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;
    }

    // Print LinkedList
    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
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

        int l = 2;
        int r = 4;

        head = reverseBetween(l, r, head);

        System.out.println("After:");
        printList(head);
    }
}