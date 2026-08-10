import java.util.Arrays;
public class SortArrayBuiltin {
    public static void main(String[] args) {
        // sort -> Ascending Order 
        int[] arr = {3,4,2,1,6,7};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
} 
