import java.util.Stack;

public class RemoveConsecutiveCharacter {

    static String removeConsecutive(String s) {

        Stack<java.lang.Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Stack empty OR top character is different
            if (st.size() == 0 || st.peek() != ch) {
                st.push(ch);
            }
        }

        // Stack ko String mein convert karna
        StringBuilder ans = new StringBuilder();

        for (java.lang.Character ch : st) {
            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "aaabbccddeee";

        System.out.println("Original String: " + s);
        System.out.println("After Removing Consecutive Characters: "
                + removeConsecutive(s));
    }
}