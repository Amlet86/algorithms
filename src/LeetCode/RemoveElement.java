package LeetCode;

public class RemoveElement {

    public static void main(String[] args) {
        int result = removeElement(new int[]{1}, 1);
        System.out.println(result);
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        int result = 0;
        for (int next : nums) {
            if(next != val)
                result++;
        }

        return result;
    }

}
