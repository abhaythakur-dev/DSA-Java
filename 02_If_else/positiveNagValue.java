import java.util.Scanner;

public class positiveNagValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value :");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Given Number is Positive");
        }
        else if (n == 0) {
            System.out.println("Given Number is Zero");
        } else {
            System.out.println("Given Number is  Negative");
        }
        sc.close();

    }
}
