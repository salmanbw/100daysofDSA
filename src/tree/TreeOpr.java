package tree;

import org.w3c.dom.ls.LSOutput;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int data){this.data = data;}

}
public class TreeOpr {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(6);
        root.left = a; root.right = b; a.left = c; b.right = d; d.left = e;

        preOrder(root);
        TreeNode mirror = mirrorTree(root);
        System.out.println();
        preOrder(mirror);
        System.out.println();
        inOrder(mirror);
        System.out.println();
        System.out.println("Height of tree "+heightTree(root));
        System.out.println("diameter of tree "+diameterTree(root));
        System.out.println("if identical "+ifIdentical(root,a));
    }

    public static int LCA(TreeNode root, int num1, int num2){
        return -1;
    }



    public static boolean ifMirror(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;

        if(root1 == null || root2 == null)
            return false;

        return root1.data == root2.data && ifMirror(root1.left,root2.right) && ifMirror(root1.right, root2.left);
    }

    public static TreeNode mirrorTree(TreeNode root){
        if(root == null)
            return null;

        TreeNode temp = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = temp;

        return root;
    }

    public static boolean ifIdentical(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null)
            return true;

        if(root1.data == root2.data)
            return true;

        if(root1.data != root2.data)
            return false;

        return ifIdentical(root1.left,root2.left) && ifIdentical(root1.right, root2.right);
    }

    public static int heightTree(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
    }

    public static int diameterTree(TreeNode root){
        if(root == null)
            return 0;

        int left =  heightTree(root.left);
        int right = heightTree(root.right);

        return 1 + left + right;
    }

    public static int sizeOfTree(TreeNode root){
        if(root == null)
            return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }

    public static void preOrder(TreeNode root){
        if(root == null)
            return;

        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if(root == null)
            return ;
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
