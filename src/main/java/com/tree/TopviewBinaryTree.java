package com.tree;

import com.tree.TreeNode1;

import java.util.*;

public class TopviewBinaryTree {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));

    topview(root);

  }

  private static void topview(TreeNode1 root) {
    if(root== null) return;
    HashSet<Integer> set = new HashSet<>();
    Queue<QItem> Q = new LinkedList<QItem>();
    Q.add(new QItem(root,0));
    while(!Q.isEmpty()){
      QItem qi = Q.poll();
      int hd = qi.hd;
      TreeNode1 n = qi.node;
      if(!set.contains(hd)){
        set.add(hd);
        System.out.println(n.val);
      }
      if(n.left!=null)
        Q.add(new QItem(n.left,hd-1));
      if(n.right!=null)
        Q.add(new QItem(n.right,hd+1));
    }
  }
}

class QItem
{
  TreeNode1 node;
  int hd;
  public QItem(TreeNode1 n, int h)
  {
    node = n;
    hd = h;
  }
}
