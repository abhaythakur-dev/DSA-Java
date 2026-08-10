import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array Size = ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter Array Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        sc.close();

    }
}
