package com.tree;

public class LeftViewBinaryTree {

    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(12,
                new TreeNode1(10,null,null),
                new TreeNode1(30, new TreeNode1(20,null,null),new TreeNode1(40,null,null)));

        int maxLevel = 0;
        leftview(root,1,maxLevel);
    }

    private static void leftview(TreeNode1 root, int level, int maxLevel) {
        if(root==null) return ;
        if(maxLevel<level){
            System.out.println(root.val);
            maxLevel=level;
        }
        leftview(root.left,level+1,maxLevel);
        leftview(root.right,level+1,maxLevel);
    }
}
//https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
//https://www.geeksforgeeks.org/print-right-view-binary-tree-2/
//https://www.geeksforgeeks.org/check-weather-given-binary-tree-perfect-not/
//https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
//https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/

