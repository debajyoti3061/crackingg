package com.tree;

public class TreeNode1 {
  int val;
  TreeNode1 left;
  TreeNode1 right;

  TreeNode1(int x) {
    val = x;
  }

  public TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
    super();
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public void preorder(TreeNode1 root){
    if (root!= null){
      System.out.println(root.val);
      preorder(root.left);
      preorder(root.right);
    }
  }


  public void inorder(TreeNode1 root){
    if (root!= null){

      inorder(root.left);
      System.out.println(root.val);
      inorder(root.right);
    }
  }
}
