import java.util.Scanner;
public class UniquePath {
    public static int uniquePaths(int m, int n){
        if(m==1 || n==1) return 1;
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row = ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Col = ");
        int col = sc.nextInt();
        System.out.print("Unique Paths = "+uniquePaths(row,col));

    }
}
