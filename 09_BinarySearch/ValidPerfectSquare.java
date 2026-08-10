import java.util.Scanner;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        if (num == 1) {
            return true;
        }

        int low = 1;
        int high = num;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } 
            else if (square < num) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfectSquare(num)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }

        sc.close();
    }
}
