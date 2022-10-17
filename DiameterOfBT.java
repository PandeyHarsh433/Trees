public class DiameterOfBT {

    // Naive Solution

    static int heightBT(Node root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(heightBT(root.left), heightBT(root.right)) + 1;
        }
    }

    static int findDia(Node root) {
        if (root == null) {
            return 0;
        }

        int d1 = 1 + heightBT(root.left) + heightBT(root.right);
        int d2 = findDia(root.left);
        int d3 = findDia(root.right);

        return Math.max(d1, Math.max(d2, d3));

    }

    // More Efficient approach...
    int res = 0;

    int height(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        res = Math.max(res, 1 + lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
