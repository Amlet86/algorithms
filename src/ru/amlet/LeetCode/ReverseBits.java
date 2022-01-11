package ru.amlet.LeetCode;

public class ReverseBits {

    public static void main(String[] args) {
        int result = reverseBits(43261596);
        System.out.println(result);
    }

    private static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++, n = n >> 1) {
            if ((n & 1) == 1) result++;
            if (i != 31) result *= 2;
        }
        return result;
    }

}
