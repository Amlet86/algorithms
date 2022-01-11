package ru.amlet.LeetCode;

public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 5, 5, 11}, 10);
        for (int j : result)
            System.out.println(j);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
