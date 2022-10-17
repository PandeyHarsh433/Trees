
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class BinaryTreeFromInAndPre {

    int preIndex = 0;

    Node constructBT(int[] in, int[] pre, int is, int ie) {

        if (is > ie) {
            return null;
        }
        Node root = new Node(pre[preIndex++]);

        int inIndex;
        for (int i = is; i < ie; i++) {
            if (in[i] == root.key) {
                inIndex = i;
                break;
            }
        }
        root.left = constructBT(in, pre, is, inIndex - 1);
        root.right = constructBT(in, pre, inIndex + 1, ie);
        return root;
    }
}
