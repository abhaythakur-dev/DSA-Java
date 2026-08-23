import java.util.Stack;

public class BasicStack {

    // push = add
    // pop = remove
    // peek = top 

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();  // Collection Framework...
        st.push("10");
        st.push("20");
        st.push("30");
        st.push("40");
        
        System.out.println(st.size());
        System.out.println(st); // A.S = 0(n)

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop()); // it return the topmost element and then removes it... 
    }
}
