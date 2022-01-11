package ru.amlet.LeetCode;

public class ClimbingStairs {

    public static void main(String[] args) {
        int result = climbStairs(4);
        System.out.println(result);
    }

    private static int climbStairs(int n) {
        return step(0, n);
    }

    private static int step(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return step(i + 1, n) + step(i + 2, n);
    }

}
