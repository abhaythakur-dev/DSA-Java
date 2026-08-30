class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyStack {

    Node head;
    int len;

    // Push: element ko stack ke top par add karta hai
    void push(int ele) {

        Node temp = new Node(ele);

        temp.next = head;
        head = temp;

        len++;
    }

    // Pop: top element ko remove karke return karta hai
    int pop() {

        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = head.val;

        head = head.next;

        len--;

        return x;
    }

    // Peek: top element ko sirf return karta hai
    int peek() {

        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return head.val;
    }

    // Size: stack mein kitne elements hain
    int size() {
        return len;
    }

    // Check stack empty hai ya nahi
    boolean isEmpty() {
        return head == null;
    }
}

public class LLImplementationOfStack {

    public static void main(String[] args) {

        MyStack st = new MyStack();

        // Push elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // Size
        System.out.println("Stack Size: " + st.size());

        // Peek
        System.out.println("Top Element: " + st.peek());

        // Pop
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());

        // Peek after pop
        System.out.println("Top Element: " + st.peek());

        // Size after pop
        System.out.println("Stack Size: " + st.size());

        // Check empty
        System.out.println("Is Stack Empty? " + st.isEmpty());
    }
}


