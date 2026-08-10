
public class FindMiddle {

    public static int findMiddle(Node head) {

        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {

        // Odd length: 10 -> 20 -> 30 -> 40 -> 50
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        System.out.println("Odd list middle: " + findMiddle(head1));


        // Even length: 10 -> 20 -> 30 -> 40
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);

        System.out.println("Even list middle: " + findMiddle(head2));
    }
}