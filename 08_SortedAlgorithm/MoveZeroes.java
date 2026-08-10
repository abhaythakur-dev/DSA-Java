public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.print("Before: ");
        printArray(nums);
        moveZeroes(nums);

     System.out.print("After: ");
        printArray(nums);
    }
}