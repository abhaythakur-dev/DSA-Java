public class SnakePrint {
    public static void main(String[] args) {
        int[][] arr = { { 3, 4, 5, 3 }, { 6, 5, 3, 5 }, { 7, 8, 9, 3 } };
        for(int i=0;i<arr.length;i++){
            if (i%2 == 0) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        } 
        else {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println();
    }
}
}
