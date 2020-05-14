package com.tree;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLevelOrderTraverse {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));

    reverseleveltraverse(root);

  }

  private static void reverseleveltraverse(TreeNode1 root) {
    LinkedList<TreeNode1> queue = new LinkedList<>();
    Stack<TreeNode1> s= new Stack();
    if (root == null) return ;
    queue.add(root);
    while(!queue.isEmpty()){
      root = queue.poll();
      if (root.right != null){
        queue.add(root.right);
      }if (root.left != null) {
        queue.add(root.left);
      }
      s.push(root);
    }
    while(!s.isEmpty()){
      System.out.println(s.pop().val);
      //System.out.println("commit");
    }
  }
}
