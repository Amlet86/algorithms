package ru.amlet.LeetCode;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        return buildTree(nums, 0, length -  1);
    }

    private static TreeNode buildTree(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;

        TreeNode result = new TreeNode(arr[mid]);
        result.left = buildTree(arr, start, mid - 1);
        result.right = buildTree(arr, mid + 1, end);

        return result;
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
