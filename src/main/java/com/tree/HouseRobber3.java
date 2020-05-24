package com.tree;

public class HouseRobber3 {
    public static void main(String[] args){}
    public int rob(TreeNode1 root) {
        if (root == null) return 0;
        return Math.max(robInclude(root), robExclude(root));
    }

    public int robInclude(TreeNode1 node) {
        if(node == null) return 0;
        return robExclude(node.left) + robExclude(node.right) + node.val;
    }

    public int robExclude(TreeNode1 node) {
        if(node == null) return 0;
        return rob(node.left) + rob(node.right);
    }
}
