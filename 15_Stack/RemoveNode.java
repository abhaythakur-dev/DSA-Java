class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNode {

    // Display Linked List
    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove node at a given position
    static Node removeNode(Node head, int position) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // Remove first node
        if (position == 0) {
            return head.next;
        }

        Node temp = head;

        // Reach the node before the node to delete
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp.next == null) {
            return head;
        }

        // Remove node
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {

        
        Node head = new Node(7);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(13);

        System.out.println("Before removing:");
        display(head);

        // Remove node at position 2
        head = removeNode(head, 2);

        System.out.println("After removing:");
        display(head);
    }
}