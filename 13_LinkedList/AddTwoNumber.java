
public class AddTwoNumber {

    public static Node addTwoNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new Node(sum % 10);

            carry = sum / 10;

            current = current.next;
        }

        return dummy.next;
    }

    // Print Linked List
    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // l1 = 342
        // Stored in reverse: 2 -> 4 -> 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // l2 = 465
        // Stored in reverse: 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = addTwoNumbers(l1, l2);

        // Output: 7 -> 0 -> 8
        printList(result);
    }
}