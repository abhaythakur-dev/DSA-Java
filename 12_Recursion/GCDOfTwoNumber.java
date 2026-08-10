import java.util.Scanner;
public class GCDOfTwoNumber {
    public static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a = ");
        int a = sc.nextInt();
        System.out.print("Enter a number b = ");
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.print("GCD = "+gcd);

    }
}
