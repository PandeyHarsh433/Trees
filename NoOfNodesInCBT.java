class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class NoOfNodesInCBT {

    static int countNodes(Node root) {

        int lh = 0, rh = 0;

        Node curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }

        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }

        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(countNodes(root));
    }
}
