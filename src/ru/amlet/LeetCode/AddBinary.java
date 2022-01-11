package ru.amlet.LeetCode;

public class AddBinary {

    public static void main(String[] args) {
        String result = addBinary("11", "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101");
        System.out.println(result);
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.insert(0, carry);
        return sb.toString();
    }

}
