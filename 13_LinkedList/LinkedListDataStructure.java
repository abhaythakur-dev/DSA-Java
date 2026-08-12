


class Linkedlist{  // User Defined Data Structure
    Node head;
    Node tail;
    int size;

    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx =0;
        while(temp != null){
           if(temp.val == val) return idx;
           temp = temp.next;
           idx++;
        }
        return -1;
    }

    public void addAthead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;

        }
        size++;
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public void deleteAthead() {
        if(head==null){
            System.out.print("List is Empty = ");
            return;
        }
        head = head.next;
        if(head==null) tail = null; // only one size
        size--;
    }

   void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
       System.out.println();
    }

     int get( int idx){
        Node temp = head;
        for(int i=1; i<=idx;i++){
            temp = temp.next;

        }
        return temp.val;
    }

    public void insert(int val, int idx) {
        if(idx<0 || idx>size){
            System.out.println("Invalid Idx ");
            return;
        }
        else if(idx==0) addAthead(val);
        else{
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    void delete(int idx) {
        if(idx<0 || idx>=size){
            System.out.println("Invalid Idx ");
            return;
        }
        if(idx==0){
            deleteAthead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;

        }
        temp.next = temp.next.next; // delete
        if(idx==size-1) tail = temp; // we are deleting tail
        size--;
    }
}
public class LinkedListDataStructure {
   public  static void main(String[] args) {
       Linkedlist ll = new Linkedlist();

       ll.deleteAthead();
       ll.addAtTail(10);
       ll.addAtTail(20);
       ll.addAtTail(30);
       ll.addAtTail(40);  ll.display();
       ll.addAthead(50);
       ll.addAthead(60);  ll.display();
       ll.deleteAthead();     ll.display();
       System.out.println(ll.size);
       ll.insert(45,2);  ll.display();
       System.out.println(ll.get(4));
       ll.delete(3);    ll.display();
    }
}

// T.C = 0(1)
