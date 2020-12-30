package LeetCode;

public class MaximumSubarray {

    public static void main(String[] args) {
        int result = maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        for (int j : nums) {
            currentRunningSum = Math.max(currentRunningSum + j, j);
            maxValue = Math.max(currentRunningSum, maxValue);
        }
        return maxValue;
    }

}
