class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class LeftViewOfBT {
    Node root;
    static int max_level = 0;

    void leftViewUtil(Node root, int level) {

        // Base case
        if (root == null)
            return;

        // If this is the first root of its level
        if (max_level < level) {
            System.out.print(" " + root.key);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(root.left, level + 1);
        leftViewUtil(root.right, level + 1);
    }

    void leftView() {
        max_level = 0;
        leftViewUtil(root, 1);
    }

    public static void main(String[] args) {
        LeftViewOfBT tree = new LeftViewOfBT();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(15);
        tree.root.right.left = new Node(12);
        tree.root.right.right.left = new Node(14);
        tree.leftView();
    }
}
