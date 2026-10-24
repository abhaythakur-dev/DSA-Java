import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class KthSmallest {

    public static void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        inorder(root, arr);

        return arr.get(k - 1);
    }

    public static void main(String[] args) {

        /*
                3
               / \
              1   4
               \
                2
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int k = 1;

        System.out.println(kthSmallest(root, k));
    }
}