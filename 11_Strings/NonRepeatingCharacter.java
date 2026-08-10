public class NonRepeatingCharacter {

    public static char nonRepeatingChar(String s) {

        int[] freq = new int[256];

        // Frequency count
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // First non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '$';   // Agar koi non-repeating character na ho
    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";

        System.out.println(nonRepeatingChar(s));
    }
}