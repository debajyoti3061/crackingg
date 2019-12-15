package com.tree;

import java.util.LinkedList;

public class LevelOrderTraversal {
  public static void main(String args[]) {
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));

    leveltraverse(root);

  }

  private static void leveltraverse(TreeNode1 root) {
    LinkedList<TreeNode1> queue = new LinkedList<>();
    if (root == null) return ;
    queue.add(root);
    while(!queue.isEmpty()){
      root = queue.poll();
      System.out.println(root.val);
      if (root.left != null) {
        queue.add(root.left);
      }
      if (root.right != null){
        queue.add(root.right);
      }


    }

  }

  /**
   * List<List<Integer>> table = new ArrayList<List<Integer>>();
   Queue<TreeNode> q = new LinkedList<TreeNode>();
   q.add(root);
   while (q.peek()!=null)
   {
   List<Integer> table2 = new ArrayList<Integer>();
   int size =q.size();
   for (int i = 0 ; i < size; i ++)
   {
   TreeNode temp = q.remove();
   table2.add(temp.val);
   if (temp.left!=null) q.add(temp.left);
   if (temp.right!=null) q.add(temp.right);
   }
   table.add(table2);
   }
   return table;
   */
}
