package com.tree.binarytreetolinkedlist;

public class LowestCommonAncesterBinaryTree {
    static TreeNode1 root;
    public static void main(String args[]) {
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                        new TreeNode1(14, null, null), null)));

       TreeNode1 common = lca(9,14);
        System.out.println(common.val);
    }

    private static TreeNode1 lca(int n1, int n2) {
      return lca(root,n1,n2);

    }

    private static TreeNode1 lca(TreeNode1 root, int n1, int n2) {
        if (root == null) return null;
        if (root.val == n1 || root.val == n2){
            return root;
        }
        TreeNode1 left = lca (root.left,n1,n2);
        TreeNode1 right = lca (root.right,n1,n2);
        if (left!= null && right !=null) return root;
        if (left!= null) return left;
        else return right;
    }


}
