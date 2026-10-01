public class SumOfValues {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Sum = " + sum(root));
    }
}