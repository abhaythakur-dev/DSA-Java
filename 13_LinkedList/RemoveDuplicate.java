public class RemoveDuplicate {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicates(Node head) {

        if (head == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 10 -> 10 -> 20 -> 20 -> 30 -> 40 -> 40
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(40);

        System.out.println("Before:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After:");
        printList(head);
    }
}