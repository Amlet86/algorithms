package ru.amlet.LeetCode;

public class NumberOf1Bits {

    public static void main(String[] args) {
        int result = hammingWeight(00000000000000000000000000001011);
        System.out.println(result);
    }

    private static int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++, n = n >> 1) {
            if((n & 1) == 1) result++;
        }
        return result;
    }

}
