public class ReverseArray {
    public static void main(String[] args) { // Two Pointer Technique 
        int[] arr = { 5, 6, 7, 8, 9, 10, 12 };
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}