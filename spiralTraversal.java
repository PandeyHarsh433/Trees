import java.util.*;

public class spiralTraversal {

    // Method one

    // In this we are doing just similar to level order traversal printing every
    // elements of every level but there is one difference at every altermnate level
    // we have to print opposite way as the question is of Spiral Traversal so we
    // are also using stack because it if LIFO so for every alternate lavel we
    // change the value of reverse variable and then we store the values in stack
    // and the we pop it...

    static void spiralTraverse(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        Stack<Integer> s = new Stack<Integer>();
        Boolean reverse = false;

        q.add(root);

        while (q.isEmpty() == false) {

            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                if (reverse) {
                    s.push(curr.key);
                } else {
                    System.out.print(curr.key + " ");

                }

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

            }
            if (reverse) {
                while (s.isEmpty() == false) {
                    System.out.print(s.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }
    // Second Method...    

    // This is second method to do spiral traversal using two stacks in first stack
    // the children of second stack will be filled in opposite order and in second
    // stack the children of first stack will be filled in right order

    static void spiralTraverse2(Node root) {

        if (root == null) {
            return;
        }

        // For levels to be printed from right to left
        Stack<Node> s1 = new Stack<Node>();

        // For levels to be printed from left to right
        Stack<Node> s2 = new Stack<Node>();

        // Push first level to first stack 's1'
        s1.add(root);

        while (!s1.isEmpty() || !s1.isEmpty()) {

            while (!s1.empty()) {

                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.key + " ");

                // right is pushed before left

                if (temp.right != null)
                    s2.push(temp.right);

                if (temp.left != null)
                    s2.push(temp.left);
            }

            while (!s2.empty()) {

                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.key + " ");

                // left is pushed before right

                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }

        }

    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(7);
        tree.left.right = new Node(6);
        tree.right.left = new Node(5);
        tree.right.right = new Node(4);
        spiralTraverse2(tree);
    }
}
