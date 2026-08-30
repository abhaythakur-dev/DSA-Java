import java.util.Stack;

public class BalanceBrackets {

    static boolean isBalanced(String s) {

        int n = s.length();

        // Odd length can never be balanced
        if (n % 2 == 1) {
            return false;
        }

        Stack<java.lang.Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                st.push(ch);

            } 
            // Closing brackets
            else {

                // Stack is empty
                if (st.size() == 0) {
                    return false;
                }

                char top = st.peek();

                // Check matching bracket
                if (sameStyle(top, ch)) {
                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }

        return st.size() == 0;
    }

    static boolean sameStyle(char a, char b) {

        if (a == '(' && b == ')') {
            return true;
        }

        if (a == '[' && b == ']') {
            return true;
        }

        if (a == '{' && b == '}') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "({[]})";

        System.out.println(isBalanced(s));
    }
}