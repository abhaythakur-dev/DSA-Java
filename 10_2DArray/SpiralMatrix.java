import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

    public static ArrayList<Integer> spirallyTraverse(int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstRow = 0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {

            // Right
            for (int j = firstCol; j <= lastCol; j++) {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // Down
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(arr[i][lastCol]);
            }
            lastCol--;

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // Left
            for (int j = lastCol; j >= firstCol; j--) {
                ans.add(arr[lastRow][j]);
            }
            lastRow--;

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // Up
            for (int i = lastRow; i >= firstRow; i--) {
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns = ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements = ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> ans = spirallyTraverse(arr);

        System.out.println("Spiral Traversal = ");

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}