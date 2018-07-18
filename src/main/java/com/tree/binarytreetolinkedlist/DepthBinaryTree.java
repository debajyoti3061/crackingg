package com.tree.binarytreetolinkedlist;

import static java.lang.Math.max;

public class DepthBinaryTree {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, new TreeNode1(10,null,null)), new TreeNode1(5,null,null))));

    System.out.println(depth(root));

  }

  private static int depth(TreeNode1 root) {
    if(root == null){
      return 0;
    }
    else return 1+ max(depth(root.left),depth(root.right));
  }

}
