package LeetCode;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        int result = maxDepth(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3)));
        System.out.println(result);
    }

    private static int maxDepth(TreeNode root) {
        int result = 0;
        if (root == null) return result;
        if (root.left != null || root.right != null) {
            result = Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return ++result;
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
