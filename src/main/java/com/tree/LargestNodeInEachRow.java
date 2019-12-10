package com.tree;

import java.util.*;

//https://www.youtube.com/watch?v=91Gok_PQY24&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=32
public class LargestNodeInEachRow {
  public static void main(String[] args){
    TreeNode1 root;
    root = new TreeNode1(7,
        new TreeNode1(3,
            new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
        new TreeNode1(9,
            new TreeNode1(8, null, null), new TreeNode1(15,
            new TreeNode1(14, null, null), null)));

    List<Integer> list = largestValues(root);
    list.stream().forEach(x-> System.out.println(x));
  }

  public static List<Integer> largestValues(TreeNode1 root) {

    if(root == null) return new LinkedList<Integer>();
    int levelMax = root.val;
    List<Integer> result = new LinkedList<>();
    Queue<TreeNode1> queue = new LinkedList<TreeNode1>();
    queue.add(root);

    while(queue.size() > 0){
      int childrenCount = queue.size();
      for(int i = 0; i < childrenCount; i++){
        TreeNode1 temp = queue.poll();
        levelMax = Math.max(levelMax, temp.val);
        if(temp.right != null) queue.add(temp.right);
        if(temp.left != null) queue.add(temp.left);
      }
      result.add(levelMax);
      levelMax = Integer.MIN_VALUE;
    }

    return result;

  }
}
