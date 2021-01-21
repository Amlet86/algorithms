package LeetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        boolean result = isPalindrome("0P");
        System.out.println(result);
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = s.length();
        for (int i = 0; i < length; i++) {
            length--;
            if (s.charAt(i) != s.charAt(length))
                return false;
        }
        return true;
    }

}
