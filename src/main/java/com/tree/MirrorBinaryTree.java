package com.tree;

public class MirrorBinaryTree {
    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(1,
                new TreeNode1(3,null,null),
                new TreeNode1(2, new TreeNode1(5,null,null),new TreeNode1(4,null,null)));

        mirror(root);
        root.preorder(root);
    }

    private static TreeNode1 mirror(TreeNode1 root) {
        if(root==null) return null;
        else{
            TreeNode1 left=mirror(root.left);
            TreeNode1 right=mirror(root.right);
            root.left=right;
            root.right=left;
        }
        return root;
    }


}
