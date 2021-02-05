package LeetCode;

public class PowerOfTwo {

    public static void main(String[] args) {
        boolean result = isPowerOfTwo(536870912);
        System.out.println(result);
    }

    private static boolean isPowerOfTwo(int n) {
        double tmp = Math.log10(n) / Math.log10(2);
        return (int) tmp == tmp;
    }

}
