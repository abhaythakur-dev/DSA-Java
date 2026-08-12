

public class MergeSortLinkedList {

    // Find middle of linked list
    static Node getMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted linked lists
    static Node merge(Node left, Node right) {

        Node dummy = new Node(-1);
        Node current = dummy;

        while (left != null && right != null) {

            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } 
            else {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } 
        else {
            current.next = right;
        }

        return dummy.next;
    }

    // Merge Sort
    static Node mergeSort(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node middle = getMiddle(head);

        // Split the list
        Node rightHead = middle.next;
        middle.next = null;

        // Sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // Merge sorted halves
        return merge(left, right);
    }

    // Print linked list
    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(8);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(3);

        System.out.println("Before Sorting:");
        printList(head);

        head = mergeSort(head);

        System.out.println("After Merge Sort:");
        printList(head);
    }
}
