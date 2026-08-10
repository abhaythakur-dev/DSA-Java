


public class DeleteMiddle {

    public static Node deleteMiddle(Node head) {

        // Empty list ya single node
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        // slow middle tak jayega
        // prev, slow se ek node pehle rahega
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Middle node delete
        prev.next = slow.next;

        return head;
    }

    // Linked list print karne ke liye
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // =========================
        // ODD LIST
        // 10 -> 20 -> 30 -> 40 -> 50
        // Middle = 30
        // =========================

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        System.out.println("Before deleting middle (Odd):");
        printList(head1);

        head1 = deleteMiddle(head1);

        System.out.println("After deleting middle (Odd):");
        printList(head1);


        // =========================
        // EVEN LIST
        // 10 -> 20 -> 30 -> 40
        // Middle nodes = 20, 30
        // Delete second middle = 30
        // =========================

        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);

        System.out.println("\nBefore deleting middle (Even):");
        printList(head2);

        head2 = deleteMiddle(head2);

        System.out.println("After deleting middle (Even):");
        printList(head2);
    }
}
