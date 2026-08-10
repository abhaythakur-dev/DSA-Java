import java.util.Scanner;

public class MultipleMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row A = ");
        int r1 = sc.nextInt();

        System.out.print("Enter Col A = ");
        int c1 = sc.nextInt();

        System.out.print("Enter Row B = ");
        int r2 = sc.nextInt();

        System.out.print("Enter Col B = ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix Multiplication is not possible.");
        } 
        else {

            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] result = new int[r1][c2];

            // Input Matrix A
            System.out.println("Enter Elements of Matrix A:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Input Matrix B
            System.out.println("Enter Elements of Matrix B:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Matrix Multiplication
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Output Result
            System.out.println("Result Matrix:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}