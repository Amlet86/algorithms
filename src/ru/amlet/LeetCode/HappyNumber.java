package ru.amlet.LeetCode;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        boolean result = isHappy(2);
        System.out.println(result);
    }

    private static boolean isHappy(int n) {
        HashSet<Integer> result = new HashSet<>();
        int i = n;
        while (result.add(i)) {
            i = getSumSquares(i);
            if (i == 1)
                return true;
        }
        return false;
    }

    private static int getSumSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            sum += i * i;
            n = n / 10;
        }
        return sum;
    }
}
