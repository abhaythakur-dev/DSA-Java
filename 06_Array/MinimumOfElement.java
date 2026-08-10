public class MinimumOfElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Minimum Element in Array is : " + mini);
    }
}
