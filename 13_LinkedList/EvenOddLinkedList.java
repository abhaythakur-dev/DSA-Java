public class EvenOddLinkedList {

// Important : Odd Aur Even yahan position ko represent kar rhe hai, values ko nhi

    public static Node oddEvenList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void printList(Node t) {

        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
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

        head = oddEvenList(head);

        System.out.println("After:");
        printList(head);
    }
}

