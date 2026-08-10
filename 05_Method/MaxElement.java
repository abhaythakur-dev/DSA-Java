public class MaxElement {
    public static int maxElement(int[] arr) {
        int max = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];


            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 10 };
        System.out.println("Max Element = "+maxElement(arr));
    }

}
