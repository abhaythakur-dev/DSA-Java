class RotateList {

    public static Node rotateRight(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        Node tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // If k is greater than length
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Make circular linked list
        tail.next = head;

        // Find new tail
        int steps = length - k;
        Node newTail = tail;

        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        // New head
        Node newHead = newTail.next;

        // Break circular link
        newTail.next = null;

        return newHead;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before:");

        printList(head);

        int k = 2;

        head = rotateRight(head, k);

        System.out.println("After rotating " + k + " times:");

        printList(head);
    }
}