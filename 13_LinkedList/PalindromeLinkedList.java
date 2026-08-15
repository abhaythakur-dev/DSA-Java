import java.util.ArrayList;

public class PalindromeLinkedList {

    public static boolean isPalindrome(Node head) {

        Node temp = head;

        ArrayList<Integer> arr = new ArrayList<>();

        // Store linked list elements in ArrayList
        
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Two pointer approach
        int i = 0;
        int j = arr.size() - 1;

        while (i <= j) {

            int a = arr.get(i);
            int b = arr.get(j);

            if (a != b) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 2 -> 1

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Linked List:");
        printList(head);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}