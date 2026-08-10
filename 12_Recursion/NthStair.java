import java.util.Scanner;
public class NthStair {
    public static int countWays(int n){
        if(n<=2) return n;

        return countWays(n-1) + countWays(n-2);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of Stair = ");
        int n = sc.nextInt();
        System.out.print("Nth Stair = "+countWays(n));
    }
}
