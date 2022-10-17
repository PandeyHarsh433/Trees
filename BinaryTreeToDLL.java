
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class BinaryTreeToDLL {
    Node prev = null;

    Node BTtoDLL(Node root) {

        if (root == null) {
            return root;
        }

        Node head = BTtoDLL(root.left);

        if (prev == null) {
            head = root;
        }

        else {
            root.left = prev;
            root.right = root;
        }
        prev = root;
        BTtoDLL(root.right);
        return head;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
    }
}
