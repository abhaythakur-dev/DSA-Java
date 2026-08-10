import java.util.Arrays;

public class MostFrequentCharacter {

    public static char getMaxOccuringChar(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int maxFreq = 1;
        char ans = arr[0];

        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;

                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }

                i = j;
            }
        }

        int freq = j - i;
        if (freq > maxFreq) {
            ans = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "testsample";

        System.out.println("Input : " + s);
        System.out.println("Output: " + getMaxOccuringChar(s));
    }
}