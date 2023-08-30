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
        root.left = a; root.right = b; a.left = c; b.right = d;

        preOrder(root);
        TreeNode mirror = mirrorTree(root);
        System.out.println();
        preOrder(mirror);
        System.out.println();
        inOrder(mirror);
    }

    public static TreeNode mirrorTree(TreeNode root){
        if(root == null)
            return null;

        TreeNode temp = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = temp;

        return root;
    }

    public static int heightTree(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
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
