package com.tree;

/**
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 *
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 *
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 *
 * Example 1:
 * Input: [1,null,0,0,1]
 * Output: [1,null,0,null,1]
 *
 * Explanation:
 * Only the red nodes satisfy the property "every subtree not containing a 1".
 * The diagram on the right represents the answer.
 */
public class BinaryTreePruning {

  public static void main(String args[])
  {
    TreeNode1 root;
    root = new TreeNode1(1,
        new TreeNode1(1,
            new TreeNode1(0, null, null), new TreeNode1(0, null, null)),
        new TreeNode1(1,
            new TreeNode1(0, null, null), new TreeNode1(0,
            new TreeNode1(1, null, new TreeNode1(0,null,null)), new TreeNode1(0,null,null))));

    pruneTree(root);
  }

  public static TreeNode1 pruneTree(TreeNode1 root) {
    return containsOne(root) ? root : null;
  }

  public static boolean containsOne(TreeNode1 node) {
    if (node == null) return false;
    boolean a1 = containsOne(node.left);
    boolean a2 = containsOne(node.right);
    if (!a1) node.left = null;
    if (!a2) node.right = null;
    return node.val == 1 || a1 || a2;
  }
}
