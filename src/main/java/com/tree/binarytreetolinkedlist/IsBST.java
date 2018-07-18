package com.tree.binarytreetolinkedlist;

public class IsBST {

    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                                                                                        new TreeNode1(14, null, null), null)));

        System.out.println(isBST(root));

    }

    private static boolean isBST(TreeNode1 root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBST(TreeNode1 root, int minValue, int maxValue) {
        if (root == null) return true;
        else  if (root.val <= minValue || root.val> maxValue)
            return false;
        return isBST(root.left,minValue,root.val) && isBST(root.right,root.val,maxValue);
    }




}
