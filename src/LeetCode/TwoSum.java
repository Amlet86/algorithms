package LeetCode;

public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 5, 5, 11}, 10);
        for (int j : result)
            System.out.println(j);
    }

    private static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;

            for (int j = i+1; j < nums.length; j++) {
                tmp = j;
                if ((nums[i] + nums[j]) == target) {
                    break;
                }
            }
            if ((nums[i] + nums[tmp]) == target) {
                result = new int[]{i, tmp};
                break;
            }
        }
        return result;
    }
}
