import java.util.Scanner;
public class NthFibonacci {
    public  static int nthFibonacci(int n){
        if(n==0 || n==1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        System.out.print("Fibonacci = "+nthFibonacci(n));
    }
}

