package ru.amlet.LeetCode;

public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{8, 9, 9, 9});
    }

    private static int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        for (int i = last; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
                digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
