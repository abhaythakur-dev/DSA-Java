import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            // Integer score
            if (op.equals("+")) {
                int top = st.pop();
                int secondTop = st.peek();

                int sum = top + secondTop;

                st.push(top);
                st.push(sum);

            }

            // Double previous score
            else if (op.equals("D")) {
                st.push(2 * st.peek());
            }

            // Remove previous score
            else if (op.equals("C")) {
                st.pop();
            }

            // Add new score
            else {
                st.push(Integer.parseInt(op));
            }
        }

        // Calculate total score
        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        System.out.println("Total Score: " + calPoints(operations));
    }
}