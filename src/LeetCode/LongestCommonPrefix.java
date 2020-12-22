package LeetCode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String result = longestCommonPrefix(new String[]{"dog","racecar","car"});
        System.out.println(result);
    }

    private static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        for (String wordFromStrs : strs) {
            if (!commonPrefix.equals("") || !wordFromStrs.equals(strs[0])) {
                char[] lettersFromPrefix = commonPrefix.toCharArray();
                for (int i = 0; i < lettersFromPrefix.length; i++) {
                    if (wordFromStrs.toCharArray().length <= i || wordFromStrs.toCharArray()[i] != lettersFromPrefix[i]) {
                        char[] tmp = new char[i];
                        System.arraycopy(lettersFromPrefix, 0, tmp, 0, i);
                        commonPrefix = new String(tmp);
                        break;
                    }
                }
            } else {
                commonPrefix = wordFromStrs;
            }
        }
        return commonPrefix;
    }
}
