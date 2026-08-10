public class ReverseSB {
    public static void main(String[] args) {
        String s = "Abhii";
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();

        // sb.deleteCharAt(4);
        
        sb.delete(0, 2);

        System.out.println(sb);
    }
}
