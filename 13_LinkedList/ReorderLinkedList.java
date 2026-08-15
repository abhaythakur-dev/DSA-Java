public class ReorderLinkedList {

    public static void reorderList(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle of LinkedList
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Merge both 
        Node first = head;
        Node second = prev;

        while (second.next != null) {

            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
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
          head.next.next.next.next.next = new Node(6);

        System.out.println("Before:");
        printList(head);

        reorderList(head);

        System.out.println("After:");
        printList(head);
    }
}