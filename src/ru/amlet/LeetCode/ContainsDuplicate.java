package ru.amlet.LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        boolean result = containsDuplicate(new int[]{});
        System.out.println(result);
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

}
