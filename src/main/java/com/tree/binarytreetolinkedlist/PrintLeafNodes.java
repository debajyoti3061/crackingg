package com.tree.binarytreetolinkedlist;

public class PrintLeafNodes {
    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                        new TreeNode1(14, null, null), null)));

        printleaf(root);

    }

    private static TreeNode1 printleaf(TreeNode1 root) {
        if(root == null) return root;
        if(root.left == null && root.right== null)
            System.out.println(root.val);
        root.left = printleaf(root.left);
        root.right = printleaf(root.right);
        return root;
    }
}
