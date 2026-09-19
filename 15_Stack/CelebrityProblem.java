import java.util.Stack;

public class CelebrityProblem{

    public static int celebrity(int arr[][]) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            boolean aFlag = true;
            boolean bFlag = true;

            if (arr[a][b] == 1) {
                aFlag = false;
            } else {
                bFlag = false;
            }

            if (arr[b][a] == 1) {
                bFlag = false;
            } else {
                aFlag = false;
            }

            if (aFlag) {
                st.push(a);
            }

            if (bFlag) {
                st.push(b);
            }
        }

        if (st.size() == 0) {
            return -1;
        }

        int celeb = st.pop();

        // Celebrity kisi ko nahi jaanta
        for (int j = 0; j < n; j++) {

            if (j == celeb)
                continue;

            if (arr[celeb][j] == 1) {
                return -1;
            }
        }

        // Sab celebrity ko jaante hain
        for (int i = 0; i < n; i++) {

            if (i == celeb)
                continue;

            if (arr[i][celeb] == 0) {
                return -1;
            }
        }

        return celeb;
    }

    public static void main(String[] args) {

        int arr[][] = {
            {0, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };

        System.out.println(celebrity(arr));
    }
}