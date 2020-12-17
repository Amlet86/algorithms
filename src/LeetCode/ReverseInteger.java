package LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {
        int result = reverse2(120);
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

    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}


