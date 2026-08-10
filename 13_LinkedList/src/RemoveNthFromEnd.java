package Node;


public class RemoveNthFromEnd {

    public static Node removeNthFromEnd(Node head, int n) {

        if (head == null || n <= 0) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        // Fast ko n steps aage le jao
        for (int i = 0; i < n; i++) {

            if (fast.next == null) {
                return head;   // n > length
            }

            fast = fast.next;
        }

        // Fast aur slow ko saath move karo
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Nth node delete
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40 -> 50

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        System.out.println("Before:");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.println("After:");
        printList(head);
    }
}