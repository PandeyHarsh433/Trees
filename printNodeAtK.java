class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class printNodeAtK {

    static void printAtK(Node root, int k) {
        if(root == null) {
            return;
        }
        if(k == 0) {
            System.out.print(root.key + " ");
        }
        printAtK(root.left, k-1);
        printAtK(root.right, k-1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        printAtK(root,2);
    }
};