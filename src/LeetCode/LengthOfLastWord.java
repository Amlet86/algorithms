package LeetCode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        int result = lengthOfLastWord(" ");
        System.out.println(result);
    }

    private static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        if (array.length > 0) {
            return array[array.length - 1].length();
        }
        return 0;
    }
}
