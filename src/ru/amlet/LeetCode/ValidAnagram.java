package ru.amlet.LeetCode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        boolean result = isAnagram("anagram", "nagaram");
        System.out.println(result);
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

}
