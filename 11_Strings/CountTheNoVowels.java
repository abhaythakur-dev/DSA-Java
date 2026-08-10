
public class CountTheNoVowels {
    public static void main(String[] args) {
        String s = "aburdkdlioe";                       
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u');
            count++;
        }
        System.out.println(count);
    }
}

