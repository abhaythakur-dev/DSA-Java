import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array Size = ");
        int n = sc.nextInt();
        int product = 1;
        int[] arr = new int[n];
        System.out.print("Enter Array Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }
        System.out.println("Product Of Array = "+product);
        sc.close();

    }
}

