public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 18, 7, 17, 45, 77, 333 };
        int target = 18;
        boolean flag = false; // False means Target is not Available in Array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true; // True means Target is Available in Array

                break;
            }
        }
        if (flag)
            System.out.println("Target is Exist in Array");
             
        else {
            System.out.println("Target is Missing in Array");
        }
         
    }
} 