

public class CircularLinkedList{

    // Function to print nodes in Circular Linked List
    static void printList(Node head) {

        if (head == null) {
            return;
        }

        System.out.print(head.val + " ");

        Node temp = head.next;

        while (temp != head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Last node points back to head
        fourth.next = head;

        // Print Circular Linked List
        printList(head);
    }
}