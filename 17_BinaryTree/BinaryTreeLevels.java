import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { 
        this.val = val; 
    }
}

public class BinaryTreeLevels {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        // Tree: 
        //         1  (Level 1)
        //       /   \
        //      2     3  (Level 2)
        //     / \
        //    4   5      (Level 3 - Max Level)
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        List<List<Integer>> levels = levelOrder(root);
        
        if (!levels.isEmpty()) {
            // 1. Max Level kitna hai (Total levels)
            int maxLevelNumber = levels.size();
            System.out.println("Max Level Number: " + maxLevelNumber); // Output: 3
            
            // 2. Max Level par kaun-kaun se elements hain (Last level)
            List<Integer> maxLevelElements = levels.get(levels.size() - 1);
            System.out.println("Elements at Max Level: " + maxLevelElements); // Output: [4, 5]
        }
    }
}