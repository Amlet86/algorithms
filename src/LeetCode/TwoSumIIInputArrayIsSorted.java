package LeetCode;

public class TwoSumIIInputArrayIsSorted {

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }
            }
            if(result[0] != 0 && result[1] != 0) break;
        }
        return result;
    }

}
