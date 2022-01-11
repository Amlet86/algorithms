package ru.amlet.LeetCode;

public class MajorityElement {

    public static void main(String[] args) {
        int result = majorityElement(new int[]{6,5,5});
        System.out.println(result);
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        for (int i = 0; i <= n; i++) {
            int tmp = 0;
            for (int j = i + 1; j < nums.length && tmp <= n; j++) {
                if (nums[i] == nums[j]) {
                    tmp++;
                }
            }
            if (tmp >= n) {
                return nums[i];
            }
        }
        return nums[0];
    }

}
