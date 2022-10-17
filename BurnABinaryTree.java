
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class Distance {
    int val;
    Distance(int d) {
        val = d;
    }
}

public class BurnABinaryTree {

    int res = 0;
    // static int burnTree(Node root, int leaf, int distance) {
    //     if(root==null) {
    //         return 0;
    //     }

    // }

    public static void main (String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
    }
}
