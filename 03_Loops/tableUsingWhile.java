import java.util.Scanner;

public class tableUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i = 1;

        System.out.println("Multiplication Table of " + number + ":");
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
        sc.close();
    }
}
