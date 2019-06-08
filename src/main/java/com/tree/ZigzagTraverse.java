package com.tree;

import java.util.Stack;

public class ZigzagTraverse {

    public static void main(String args[]) {
        TreeNode1 root;
        root = new TreeNode1(7,
                new TreeNode1(3,
                        new TreeNode1(1, null, null), new TreeNode1(6, null, null)),
                new TreeNode1(9,
                        new TreeNode1(8, null, null), new TreeNode1(15,
                        new TreeNode1(14, null, null), null)));

        spiralWithTwoStack(root);
    }
        public static void spiralWithTwoStack (TreeNode1 root){
            if (root == null) {
                return;
            }
            Stack<TreeNode1> s1 = new Stack<>();
            Stack<TreeNode1> s2 = new Stack<>();
            s1.push(root);

            while (!s1.isEmpty() || !s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    root = s1.pop();
                    System.out.print(root.val + " ");
                    if (root.left != null) {
                        s2.push(root.left);
                    }
                    if (root.right != null) {
                        s2.push(root.right);
                    }
                }
                while (!s2.isEmpty()) {
                    root = s2.pop();
                    System.out.print(root.val + " ");
                    if (root.right != null) {
                        s1.push(root.right);
                    }
                    if (root.left != null) {
                        s1.push(root.left);
                    }
                }
            }
        }
    }