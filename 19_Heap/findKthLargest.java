import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : nums) {
            pq.add(ele);
            if (pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}

public class findKthLargest {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        System.out.println(sol.findKthLargest(nums1, 2)); // 5

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.print(sol.findKthLargest(nums2, 4)); // 4
    }
}