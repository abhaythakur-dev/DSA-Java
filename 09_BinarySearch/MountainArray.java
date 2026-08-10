public class MountainArray {
    public static int peakElement(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while(lo<hi) {
            int mid = (hi+lo)/2;
            if(arr[mid] < arr[mid+1]) {
                lo = mid + 1;
            }
            else{
                    hi = mid;
                }
        }
        return arr[lo];
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 5, 6, 8, 2};
        
        System.out.println("Peak Element = "+peakElement(arr));  
    }
}
