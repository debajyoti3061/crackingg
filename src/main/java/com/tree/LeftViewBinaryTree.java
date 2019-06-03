package com.tree;

public class LeftViewBinaryTree {
    TreeNode1 root;
    static int  max_left_level = 0;
    static int  max_right_level = 0;

    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(12,
                new TreeNode1(10,null,null),
                new TreeNode1(30, new TreeNode1(20,null,null),new TreeNode1(40,null,null)));

        leftView(root,1);
        System.out.println();
        rightView(root,1);
    }

    private static void rightView(TreeNode1 node, int level) {
        if (node==null) return;

        // If this is the first node of its level
        if (max_right_level < level)
        {
            System.out.print(" " + node.val);
            max_right_level = level;
        }

        // Recur for left and right subtrees
        rightView(node.right, level+1);
        rightView(node.left, level+1);
    }

    static void leftView(TreeNode1 node, int level)
    {
        // Base Case
        if (node==null) return;

        // If this is the first node of its level
        if (max_left_level < level)
        {
            System.out.print(" " + node.val);
            max_left_level = level;
        }

        // Recur for left and right subtrees
        leftView(node.left, level+1);
        leftView(node.right, level+1);
    }
}
//https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
//https://www.geeksforgeeks.org/print-right-view-binary-tree-2/
//https://www.geeksforgeeks.org/check-weather-given-binary-tree-perfect-not/
//https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
//https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/

