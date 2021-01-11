package LeetCode;

public class SameTree {

    public static void main(String[] args) {
        boolean result = isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
            new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        System.out.println(result);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (q == null || p == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
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
