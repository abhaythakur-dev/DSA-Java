public class SubtreeOfAnotherTree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // root:      3
        //           / \
        //          4   5
        //         / \
        //        1   2
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        // subRoot:   4
        //           / \
        //          1   2
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        System.out.println(isSubtree(root, subRoot)); // true

        // 1 ke neeche 0 add karo, ab structure match nahi karega
        root.left.left.left = new Node(0);
        System.out.println(isSubtree(root, subRoot)); // false
    }
}
