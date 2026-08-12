
public class SwapNodes {

    public static Node swapNodes(Node head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        Node first = head;
        Node second = head;

        // k-th node from beginning
        for (int i = 1; i < k; i++) {
            if (first == null) {
                return head;
            }
            first = first.next;
        }

        if (first == null) {
            return head;
        }

        // second ko end tak le jao
        Node temp = first;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // Values swap
        int value = first.val;
        first.val = second.val;
        second.val = value;

        return head;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40 -> 50

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int k = 2;

        System.out.println("Before:");
        printList(head);

        head = swapNodes(head, k);

        System.out.println("After:");
        printList(head);
    }
}
