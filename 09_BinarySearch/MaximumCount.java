public class MaximumCount {

    public static int maximumCount(int[] nums) {

        int positive = 0;
        int negative = 0;

        for (int num : nums) {

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        return Math.max(positive, negative);
    }

    public static void main(String[] args) {

        int[] nums = {-3, -2, -1,2,3,0, 1, 2};

        System.out.println("Maximum Count = " + maximumCount(nums));
    }
} 
    
