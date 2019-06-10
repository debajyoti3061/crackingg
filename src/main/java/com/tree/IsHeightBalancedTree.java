package com.tree;

public class IsHeightBalancedTree {
  static boolean isBalanced(TreeNode1 node)
  {
    int lh; /* for height of left subtree */

    int rh; /* for height of right subtree */

    /* If tree is empty then return true */
    if (node == null)
      return true;

    /* Get the height of left and right sub trees */
    lh = height(node.left);
    rh = height(node.right);

    if (Math.abs(lh - rh) <= 1
        && isBalanced(node.left)
        && isBalanced(node.right))
      return true;

    /* If we reach here then tree is not height-balanced */
    return false;
  }

  /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
  static int height(TreeNode1 node)
  {
    /* base case tree is empty */
    if (node == null)
      return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
    return 1 + Math.max(height(node.left), height(node.right));
  }

  public static void main(String args[])
  {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, new TreeNode1(10,null,null)), new TreeNode1(5,null,null))));

    if(isBalanced(root))
      System.out.println("Tree is balanced");
    else
      System.out.println("Tree is not balanced");
  }
}
