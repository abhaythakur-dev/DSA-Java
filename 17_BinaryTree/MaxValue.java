class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaxValue {
    
    private static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(25);

        System.out.println("Maximum value = " + maxValue(root));
    }
}