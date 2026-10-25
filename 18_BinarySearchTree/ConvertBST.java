import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ConvertBST {

    private void inorder(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null) return;

        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }

    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();

        inorder(root, arr);
        Collections.reverse(arr);

        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).val;
            arr.get(i).val = sum;
        }

        return root;
    }

    // Print tree using inorder traversal
    private void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        ConvertBST solution = new ConvertBST();

        // Create a Binary Search Tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        root = solution.convertBST(root);

        System.out.println("Greater Sum Tree (Inorder):");
        solution.printInorder(root);
    }
}