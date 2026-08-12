
public class IntersectionOfLinkedList {

    public static Node getIntersection(Node head1, Node head2) {

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String[] args) {

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        Node head2 = new Node(5);
        head2.next = new Node(15);

        // Common part
        Node common = new Node(40);
        common.next = new Node(50);

        head1.next.next.next = common;
        head2.next.next = common;

        Node intersection = getIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection point =  " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}