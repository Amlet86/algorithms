package ru.amlet.LeetCode;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        int result = trailingZeroes(13);
        System.out.println(result);
    }

    private static int trailingZeroes(int n) {
        if(n == 0) return 0;

        int result = 0;
        while(n >= 5){
            result += n / 5;
            n = n / 5;
        }

        return result;
    }

}
