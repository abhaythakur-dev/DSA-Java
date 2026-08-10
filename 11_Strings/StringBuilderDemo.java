
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abhay");
        System.out.println(s.length()+" "+s.capacity());
            System.out.println(s);


        // Set CharacterAt
        s.append("Thakur");
        System.out.println(s);
    }
}
