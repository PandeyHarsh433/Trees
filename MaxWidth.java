import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class MaxWidth {

    static int maxWid(Node root) {

        int res = 0;
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (q.isEmpty() == false) {

            Node curr = q.poll();
            res = Math.max(res,q.size());

            if (curr.left != null) {    
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println(maxWid(root));
    }
}
