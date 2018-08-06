package com.tree;

public class TreetoDoubleLinkedList {
  static TreeNode1 prev = null;
  static TreeNode1 head;
  public static void main(String args[]) {
    TreeNode1 root;

    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));

    treetoDoubleLinkedList(root);
    printlist(head);

  }

  private static void printlist(TreeNode1 head) {
    while(head!=null){
      System.out.println(head.val);
      head = head.right;
    }
  }

  private static void treetoDoubleLinkedList(TreeNode1 root) {
   if(root == null) return ;
    treetoDoubleLinkedList(root.left);
    if(prev == null){
      head = root;
    }
    else {
      root.left = prev;
      prev.right = root;
    }
    prev = root;
    treetoDoubleLinkedList(root.right);
  }
}
