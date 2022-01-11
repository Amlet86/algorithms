package ru.amlet.LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        boolean result = isPalindrome(0);
        System.out.println(result);
    }

    private static boolean isPalindrome(int x){
        if(x >= 0) {
            int reverse = 0;
            int origin = x;
            while (x != 0) {
                int tmp = x % 10;
                x /= 10;
                reverse = reverse * 10 + tmp;
            }
            return reverse == origin;
        }
        return false;
    }
}
