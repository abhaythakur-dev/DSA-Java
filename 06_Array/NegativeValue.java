import java.util.Scanner;

public class NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element = ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Printing negative Value

        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                System.out.print(arr[i] + " ");

        sc.close();

    }
}
