package com.tree.binarytreetolinkedlist;

public class TreeNode1 {
  int val;
  TreeNode1 left;
  TreeNode1 right;

  TreeNode1(int x) {
    val = x;
  }

  public void preorder(TreeNode1 root){
    if (root!= null){
      System.out.println(root.val);
      preorder(root.left);
      preorder(root.right);
    }
  }
}
