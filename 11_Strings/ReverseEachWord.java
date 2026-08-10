public class ReverseEachWord {

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder temp = new StringBuilder(words[i]);
            result.append(temp.reverse());

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "i love java";

        System.out.println(reverseWords(s));
    }
}
