

public class KthFromEnd {

    public static int kthFromEnd(Node head, int k) {

        if (head == null || k <= 0) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        // Fast pointer ko k steps aage le jao
        for (int i = 0; i < k; i++) {

            if (fast == null) {
                return -1;
            }

            fast = fast.next;
        }

        // Dono pointers ko saath move karo
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40 -> 50

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int k = 5;

        System.out.println("Kth from end: " + kthFromEnd(head, k));
    }
}
