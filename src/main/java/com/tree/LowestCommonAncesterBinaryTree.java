package com.tree;

public class LowestCommonAncesterBinaryTree {
    static TreeNode1 root;
    public static void main(String args[]) {
        root = new TreeNode1(20,
                new TreeNode1(8,
                    new TreeNode1(4,null,null),
                    new TreeNode1(12,
                        new TreeNode1(10,null,null),
                        new TreeNode1(14,null,null)))
                ,new TreeNode1(22,null,null));

       TreeNode1 common = lca(10,14);
       if (common ==null) System.out.println("no common");
       else System.out.println(common.val);
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
        if (left == null && right ==null) return null;
        if (left!= null ) return left;
        else return right;

    }


}
