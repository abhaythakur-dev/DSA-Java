
public class MergeTwoSortedList{

    static Node sortedMerge(Node head1, Node head2) {

        Node i = head1;
        Node j = head2;

        Node dummy = new Node(-1);
        Node k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } 
            else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if (i == null) {
            k.next = j;
        } 
        else {
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

        // First sorted linked list
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        // Second sorted linked list
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        System.out.println("First List:");
        printList(head1);

        System.out.println("Second List:");
        printList(head2);

        Node mergedHead = sortedMerge(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}