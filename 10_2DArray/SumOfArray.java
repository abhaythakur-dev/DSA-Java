public class SumOfArray {
    public static void main(String[] args) {
        int [][] arr = {{3,4,5,3},{6,5,3,5},{7,8,9,3}};
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                sum+= arr[i][j];
            }
        }
         System.out.println(sum);
    }
}
