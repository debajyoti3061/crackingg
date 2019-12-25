package com.tree;

/**
 * You are given a binary tree in which each node contains an integer value.

 Find the number of paths that sum to a given value.

 The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

 The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

 Example:

 root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

 10
 /  \
 5   -3
 / \    \
 3   2   11
 / \   \
 3  -2   1

 Return 3. The paths that sum to 8 are:

 1.  5 -> 3
 2.  5 -> 2 -> 1
 3. -3 -> 11
 */
public class PathSum3 {

    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                        new TreeNode1(14, null, new TreeNode1(10,null,null)), new TreeNode1(5,null,null))));

        System.out.println(pathSum(root,11));

    }

    public static  int pathSum(TreeNode1 root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private static int pathSumFrom(TreeNode1 node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
}
