import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

            public class GeneratedParentheses {

                public void generateParenthesis(int n, int l, int r, String s, List<String> ans) {

                    if (r == n) {
                        ans.add(s);
                        return;
                    }

                    if (l < n) {
                        generateParenthesis(n, l + 1, r, s + "{", ans);
        }

        if (r < l) {
            generateParenthesis(n, l, r + 1, s + "}", ans);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generateParenthesis(n, 0, 0, "", ans);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of n = ");
        int n = sc.nextInt();

        GeneratedParentheses obj = new GeneratedParentheses();

        List<String> ans = obj.generateParenthesis(n);




        System.out.println("Generated Parentheses = " + ans);


        sc.close();
    }
}