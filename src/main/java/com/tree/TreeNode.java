package com.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {

  String data;
  TreeNode left;
  TreeNode right;

  public TreeNode(String data, TreeNode left, TreeNode right) {
    super();
    this.data = data;
    this.left = left;
    this.right = right;
  }

  static void createLevelLinkedList(TreeNode root,
                                    ArrayList<LinkedList<TreeNode>> lists, int level) {
    if (root == null)
      return;
    LinkedList<TreeNode> list = null;
    if (lists.size() == level) {
      list = new LinkedList<TreeNode>();

      lists.add(list);
    } else {
      list = lists.get(level);
    }
    list.add(root);
    for (TreeNode l : list) {
      System.out.println(l.data);
    }
    System.out.println("");
    createLevelLinkedList(root.left, lists, level + 1);
    createLevelLinkedList(root.right, lists, level + 1);
  }

  static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
    createLevelLinkedList(root, lists, 0);
    return lists;
  }

  public static void printResult(List<LinkedList<TreeNode>> result) {
    int depth = 0;
    /* Loop through each entry is the list and get iterator */
    for (LinkedList<TreeNode> entry : result) {
      Iterator<TreeNode> iterator = entry.iterator();
      System.out.println("Linked List at depth " + depth + " : ");
      /* Keep printing until we have elements in the iterator */
      while (iterator.hasNext()) {
				/* Get the node and print its data */
        TreeNode treeNode = (TreeNode) iterator.next();
        System.out.println(treeNode.data);
      }
      System.out.println();
      depth++;
    }
  }

  public static void main(String[] args) {

    TreeNode root = new TreeNode("A", new TreeNode("B", new TreeNode("B1",
        null, null), new TreeNode("B2", null, null)), new TreeNode("C",
        new TreeNode("C1", null, null), new TreeNode("C2",
        new TreeNode("C2a", null, null), null)));

    List<LinkedList<TreeNode>> list = createLevelLinkedList(root);
    printResult(list);
  }

}
