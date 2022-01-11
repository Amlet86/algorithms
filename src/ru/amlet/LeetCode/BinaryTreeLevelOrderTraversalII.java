package ru.amlet.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args) {
        levelOrderBottom(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelTraversal = new ArrayList<>();
        traverse(root, levelTraversal, 0);
        Collections.reverse(levelTraversal);
        return levelTraversal;
    }

    private static void traverse(TreeNode node, List<List<Integer>> levelTraversal, int level) {
        if (node == null) {
            return;
        }
        if (levelTraversal.size() <= level) {
            levelTraversal.add(new ArrayList<>());
        }
        levelTraversal.get(level).add(node.val);
        traverse(node.left, levelTraversal, level + 1);
        traverse(node.right, levelTraversal, level + 1);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
