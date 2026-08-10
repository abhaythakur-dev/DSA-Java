import java.util.ArrayList;

public class StringsBasicMore {
    public static void main(String[] args) {
        String s = "Har Har Mahadev..";
        change(s);
        System.out.println(s);

        // Arrays of Strings
        String [] arr = {"Abhay","Harsh","Arjun","Rudra"};
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
        ArrayList<String> al = new ArrayList<>();
        al.add("Lakshay");
        al.add("Nitesh");
        al.add("Anmol");
        al.add("Yuvraj");
        System.out.println(al);

        change2(al);
        System.out.println(al);

    }

    private static void change2(ArrayList<String> al) {
        al.add("Jai Mahakal ");
    }

    private static void change (String s) {
        s = "Thakur jiiii";
    }
}
