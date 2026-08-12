public class DetectLoop {

    public static boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Creating loop
        head.next.next.next.next.next = head.next.next;

        if (detectLoop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop");
        }
    }
}