public class PrintNtoOneNumber {
    public static void main(String[] args) {
        print(20);
    }

    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println("Number = "+n);
        print(n - 1);
    }
}
