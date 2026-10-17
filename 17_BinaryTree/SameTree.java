public class SameTree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // root1 = [1, 2, 3, 4]
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);

        // root2 = [1, 2, 3, 4]
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);

        System.out.println(isSameTree(root1, root2)); // true

        // ek value badal ke check karo
        root2.left.left.val = 5;
        System.out.println(isSameTree(root1, root2)); // false
    }
}