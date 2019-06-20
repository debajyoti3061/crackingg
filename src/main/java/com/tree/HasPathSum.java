package com.tree;

public class HasPathSum {
    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(-1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                        new TreeNode1(14, null, null), null)));
        int sum =9;
        System.out.println(haspathsum(root,sum));

    }

    private static boolean haspathsum(TreeNode1 root, int sum) {
        if(root==null) return false;
        if(root.left== null && root.right==null && sum-root.val==0) return true;
        else return (haspathsum(root.left,sum-root.val)||haspathsum(root.right,sum-root.val));
    }

}
