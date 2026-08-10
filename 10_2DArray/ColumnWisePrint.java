
public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = { { 3, 4, 5, 3 }, { 6, 5, 3, 5 }, { 7, 8, 9, 3 } };
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
