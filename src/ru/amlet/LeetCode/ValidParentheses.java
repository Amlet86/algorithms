package ru.amlet.LeetCode;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean result = isValid("({{{{}}}))");
        System.out.println(result);
    }

    private static boolean isValid(String s) {
        if (0 == s.length() % 2) {
            StringBuilder sb = new StringBuilder(s);
            int i = 0;
            while (2 < sb.length() && i < s.length()) {
                int indexFirst = sb.indexOf("()");
                if (-1 != indexFirst) {
                    sb.delete(indexFirst, indexFirst + 2);
                }

                int indexSecond = sb.indexOf("[]");
                if (-1 != indexSecond) {
                    sb.delete(indexSecond, indexSecond + 2);
                }

                int indexThird = sb.indexOf("{}");
                if(-1 != indexThird) {
                    sb.delete(indexThird, indexThird + 2);
                }
                i+=3;
            }
            String tmp = new String(sb);
            return tmp.contains("()") || tmp.contains("[]") || tmp.contains("{}") || tmp.length() == 0;
        }
        return false;
    }

}
