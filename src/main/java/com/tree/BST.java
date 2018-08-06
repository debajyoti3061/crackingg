package com.tree;

public class BST {

  public class Tree{
    int val;
    Tree left,right ;

    Tree(int val){
      this.val = val;
      left = right = null;
    }
  }

  Tree root;

  BST(){
    root = null;
  }

  public static void main(String args[]) {
    BST b = new BST();
    b.insert(50);
    b.insert(30);
    b.insert(20);
    b.insert(40);
    b.insert(70);
    b.insert(60);
    b.insert(80);
    b.inorder();
    b.delete(30);
    b.inorder();
  }

  private void delete(int i) {
    root = deletekey(root,i);
  }

  private Tree deletekey(Tree root, int val) {
    if(root == null) return root;
    else if (root.val > val)
        root.left = deletekey(root.left,val);
    else if (root.val < val)
      root.right = deletekey(root.right,val);
    else{
      if (root.left == null){
        return root.right;
      } else if (root.right == null){
        return root.left;
      }//find the inorder successor from right subtree , replace key with that value & delete the inorder successor
        root.val = minimum(root.right);
        root.right = deletekey(root.right,root.val);
    }
    return root;
  }

  private int minimum(Tree root) {
    int min = root.val;
    while (root.left != null){
      min = root.left.val;
      root = root.left;
    }
    return min;
  }

  private void insert(int key) {
    root = insertkey(root,key);
  }

  private Tree insertkey(Tree root, int key) {
    if (root == null){
      root = new Tree(key);
      return root;
    }
    if (key > root.val){
      root.right = insertkey(root.right,key);
    }
    else if (key <= root.val){
      root.left = insertkey(root.left,key);
    }
    return root;
  }

  private void inorder() {
    inordersort(root);
  }

  private void inordersort(Tree root) {
    if (root != null){
      inordersort(root.left);
      System.out.println(root.val);
      inordersort(root.right);
    }
  }


}
