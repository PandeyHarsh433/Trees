import java.util.*;

class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class levelOrderTraversal {

    // This is Inefficient Solution

    // static void printAtK(Node root, int k) {
    // if(root == null) {
    // return;
    // }
    // if(k == 0) {
    // System.out.print(root.key + " ");
    // }
    // printAtK(root.left, k-1);
    // printAtK(root.right, k-1);
    // }

    // static int heightBT(Node root) {

    // if(root == null) {
    // return 0;
    // }
    // else {
    // return Math.max(heightBT(root.left),heightBT(root.right))+1;
    // }
    // }

    // static void levelOrder(Node root) {
    // int h = heightBT(root);
    // int i = 0;
    // while(i<=h) {
    // printAtK(root, i);
    // i++;
    // }
    // }

    // Efficient One using QUEUE

    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (q.isEmpty() == false) {

            Node curr = q.poll();
            System.out.print(curr.key + " ");

            if (curr.left != null) {    
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        levelOrder(root);
    }
}
