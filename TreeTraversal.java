class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class TreeTraversal {

    static void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    static void postOrder(Node root) {

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    static void preOrder(Node root) {

        if (root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static int heightBT(Node root) {

        if(root == null) {
            return 0;
        }
        else {
            return Math.max(heightBT(root.left),heightBT(root.right))+1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println(heightBT(root));
    }
}