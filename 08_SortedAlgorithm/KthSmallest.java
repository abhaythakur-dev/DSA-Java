public class KthSmallest {
   public static int kthSmallest(int[] arr, int k) {
        
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            // Swapping
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        return arr[k - 1];
    }
    public static void main(String[] args) {
        int [] arr = {7,10,4,3,20,15};
        int k = 3;
        System.out.println("kth Smallest element is = "+kthSmallest(arr,k));
    }
}

