package com.tree;

public class SumofLeftLeaves {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, new TreeNode1(10,null,null)), new TreeNode1(5,null,null))));

    System.out.println(sumofLeftLeaves(root));

  }

  private static int sumofLeftLeaves(TreeNode1 root) {
    if(root ==null) return 0;
    if(root.left != null && root.left.left ==null && root.left.right ==null)
      return root.left.val + sumofLeftLeaves(root.right);
    else
      return sumofLeftLeaves(root.left) + sumofLeftLeaves(root.right);
  }
}
