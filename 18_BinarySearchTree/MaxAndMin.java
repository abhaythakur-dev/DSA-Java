
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    // Function to find the minimum element in BST
    int minValue(Node root) {
        Node temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }

    // Function to find the maximum element in BST
    int maxValue(Node root) {
        Node temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.data;
    }
}

public class MaxAndMin{
    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Solution obj = new Solution();

        System.out.println("Minimum value: " + obj.minValue(root));
        System.out.println("Maximum value: " + obj.maxValue(root));
    }
}
