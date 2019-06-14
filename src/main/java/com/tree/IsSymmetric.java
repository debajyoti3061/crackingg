package com.tree;

public class IsSymmetric {
    public static void main(String args[]){
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(2,
                        new TreeNode1(3, null, null), new TreeNode1(4, null, null)),
                new TreeNode1(2,
                        new TreeNode1(4, null, null), new TreeNode1(3, null, null)));

        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode1 root) {
        if(root == null) return true;
        else return isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode1 left, TreeNode1 right) {
        if(left ==null || right ==null) return (left==right);
        if(left.val != right.val) return false;
        return isSymmetric(left.right,right.left ) && isSymmetric(left.left,right.right);
    }
}
