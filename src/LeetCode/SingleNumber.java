package LeetCode;

public class SingleNumber {

    public static void main(String[] args) {
        int result = singleNumber(new int[]{1, 0, 1});
        System.out.println(result);
    }

    private static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tmp = result;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    tmp = result;
                    break;
                } else if (nums[i] != nums[j])
                    tmp = nums[i];
            }
            if (tmp != result)
                result = tmp;
        }
        return result;
    }

}
