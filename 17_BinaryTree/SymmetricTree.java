public class SymmetricTree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    static boolean isMirror(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public static void main(String[] args) {
        // symmetric tree:    1
        //                   / \
        //                  2   2
        //                 / \ / \
        //                3  4 4  3
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(isSymmetric(root)); // true

        root.right.right.val = 5;
        System.out.println(isSymmetric(root)); // false
    }
}