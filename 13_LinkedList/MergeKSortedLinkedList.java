import java.util.ArrayList;

public class MergeKSortedLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node mergeKLists(ArrayList<Node> arr) {

        while (arr.size() > 1) {

            Node a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);

            Node b = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);

            Node c = merge(a, b);

            arr.add(c);
        }

        return arr.get(0);
    }

    static Node merge(Node head1, Node head2) {

        Node i = head1;
        Node j = head2;

        Node dummy = new Node(-1);
        Node k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if (i == null) {
            k.next = j;
        } else {
            k.next = i;
        }

        return dummy.next;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // List 1: 1 -> 4 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(4);
        head1.next.next = new Node(5);

        // List 2: 1 -> 3 -> 4
        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        // List 3: 2 -> 6
        Node head3 = new Node(2);
        head3.next = new Node(6);

        ArrayList<Node> arr = new ArrayList<>();

        arr.add(head1);
        arr.add(head2);
        arr.add(head3);

        System.out.println("Before:");
        printList(head1);
        printList(head2);
        printList(head3);

        Node result = mergeKLists(arr);

        System.out.println("After:");
        printList(result);
    }
}
