import java.util.Scanner;
public class GCD {
    public static int gcd(int a , int b){
        int hcf = 1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a = ");
        int a = sc.nextInt();
        System.out.print("Enter a number b = ");
        int b = sc.nextInt();
        int hcf = gcd(a,b);
        System.out.print("HCF = "+hcf);
    }

}
