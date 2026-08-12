
public class DisplayList {
    public static void display(Node head){
        Node temp = head; // temp is an object

        System.out.print("The val Of Node = ");
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next; // Important
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        display(a);

        System.out.println(get(a,4));
    }
    private static int get(Node head, int idx){
        Node temp = head;
        for(int i=1; i<=idx;i++){
            temp = temp.next;

        }
        return temp.val;
    }
}
