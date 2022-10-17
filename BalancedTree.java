class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}


public class BalancedTree {

    static int heightBT(Node root) {

        if(root == null) {
            return 0;
        }
        else {
            return Math.max(heightBT(root.left),heightBT(root.right))+1;
        }
    }
    


    // Naive Solution of O(n^2)...

    static boolean checkBalance(Node root) {
        if(root==null)
        return true;

        int lh = heightBT(root.left);
        int rh = heightBT(root.right);

        return (Math.abs(lh-rh)<=1 && checkBalance(root.left) && checkBalance(root.right));
    }


    // More efficient solution in O(n)...

    static int isBalanced(Node root) {
        if(root == null)
        return 0;

        int lh = isBalanced(root.left);
        if(lh==-1)
        return -1;

        int rh = isBalanced(root.right);
        if(rh==-1)
        return -1;

        if(Math.abs(lh-rh)>1)
        return -1;

        else
        return Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
        
        System.out.println(isBalanced(root));
    }
}
