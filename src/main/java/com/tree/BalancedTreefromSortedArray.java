package com.tree;

public class BalancedTreefromSortedArray {

  public static TreeNode1 createBST(int[] array) {
    if (array.length == 0)
      return null;
    return createBSTfromsortedarray(array, 0, array.length - 1);
  }

  private static TreeNode1 createBSTfromsortedarray(int[] array, int start, int end) {
    if (start > end)
      return null;
    int mid = (start + end) / 2;
    TreeNode1 root = new TreeNode1(array[mid]);
    root.left = createBSTfromsortedarray(array, start, mid - 1);
    root.right = createBSTfromsortedarray(array, mid + 1, end);
    return root;
  }

  public static void main(String args[]) {
    int[] a = new int[]{10, 20, 30, 40, 50, 60, 70};
    TreeNode1 root = createBST(a);
    root.preorder(root);

  }
}
