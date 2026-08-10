public class SortAllEvenNo {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 2, 1, 6 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int num : arr)
            System.out.println("Only Even No is Sorted = " + num);
    }
}
