import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
       
        int [] arr = {18,45,34,34};
        // int [] x = arr; 
        // x[0] = 100;
        int [] y = Arrays.copyOf(arr,arr.length); // Deep copy. 
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);

    

        // x is Shallow copy of Array
        
    }
}
