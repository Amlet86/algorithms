package ru.amlet.LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {
        int result = reverse(120);
        System.out.println(result);
    }

    private static int reverse(int x) {
        String tmp0 = String.valueOf(x);
        char[] tmp1 = tmp0.toCharArray();
        char[] tmp2 = new char[tmp1.length];

        if (tmp0.startsWith("-")) {
            tmp2[0] = tmp1[0];
            for (int i = 1; i < tmp1.length; i++) {
                tmp2[i] = tmp1[tmp1.length - i];
            }
            tmp2[tmp1.length - 1] = tmp1[1];
        } else {
            for (int i = 0; i < tmp1.length; i++) {
                tmp2[i] = tmp1[tmp1.length - (1 + i)];
            }
        }

        long reverseNum = Long.parseLong(String.valueOf(tmp2));

        return reverseNum >= Integer.MIN_VALUE && reverseNum <= Integer.MAX_VALUE ? (int) reverseNum : 0;
    }

}


