package ru.amlet.LeetCode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int result = searchInsert(new int[] {1}, 0);
        System.out.println(result);
    }

    private static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
            if (i == (nums.length - 1) && target > nums[i]){
                return nums.length;
            }
        }
        return 0;
    }
}
