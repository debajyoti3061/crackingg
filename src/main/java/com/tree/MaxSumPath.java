package com.tree;

public class MaxSumPath {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(-1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));
    int max = findMaxSum(root);
    System.out.println(max);
  }

  static int findMaxSum(TreeNode1 node) {

    // Initialize result
    // int res2 = Integer.MIN_VALUE;
    Res res = new Res();
    res.val = Integer.MIN_VALUE;

    // Compute and return result
    findMaxUtil(node, res);
    return res.val;
  }

  public static int findMaxUtil(TreeNode1 root, Res result) {
    if (root == null) return 0;
    int l = findMaxUtil(root.left, result);
    int r = findMaxUtil(root.right, result);
    int maxlr = Math.max(l, r);
    int maxsingle = Math.max(maxlr + root.val, root.val);
    int maxtop = Math.max(maxsingle, l + r + root.val);
    result.val = Math.max(result.val, maxtop);
    return maxsingle;
  }
}

class Res {
  public int val;
}

