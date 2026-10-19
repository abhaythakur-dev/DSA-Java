public class LowestCommonAncestor {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root; // p and q are on different sides
        return left != null ? left : right;             // both on the same side
    }

    public static void main(String[] args) {
        //        3
        //       / \
        //      5   1
        //     / \ / \
        //    6  2 0  8
        //      / \
        //     7   4
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        LowestCommonAncestor sol = new LowestCommonAncestor();

        // Test 1: p = 5, q = 1  -> LCA = 3
        TreeNode ans1 = sol.lowestCommonAncestor(root, root.left, root.right);
        System.out.println(ans1.val);

        // Test 2: p = 5, q = 4  -> LCA = 5 (a node can be its own ancestor)
        TreeNode ans2 = sol.lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println(ans2.val);

        // Test 3: p = 7, q = 4  -> LCA = 2
        TreeNode ans3 = sol.lowestCommonAncestor(root, root.left.right.left, root.left.right.right);
        System.out.println(ans3.val);
    }
}