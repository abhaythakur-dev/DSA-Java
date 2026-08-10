import java.util.Scanner;
public class InputAndOutputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ->> ");

        // Output Of Array

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.println("The Length of Array = " + arr.length);
        for (int i = 0; i < 8; i++) {
            System.out.print(+arr[i] + " ");

        }



       // Input Of Array 

       int[] a = new int[7];
       for(int i =0;i<7;i++){
        a[i] = sc.nextInt();


       }
       System.out.println("The Length of Array = "+a.length);
       for(int i =0;i<7;i++) {
        
        System.out.print(a[i]+" ");
       }

       sc.close();
    }

}
