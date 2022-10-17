class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class MaxInBinaryTree {

    static int maxReturn(Node root) {
        
        if(root == null)
        return Integer.MIN_VALUE;

        else {
            maxReturn(root.left);
            return Math.max(root.key,Math.max(maxReturn(root.left),maxReturn(root.right)));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(maxReturn(root));
    }
}
