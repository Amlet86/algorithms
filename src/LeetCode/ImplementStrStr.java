package LeetCode;

public class ImplementStrStr {

    public static void main(String[] args) {
        int result = strStr("aaaaa", "bba");
        System.out.println(result);
    }

    private static int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        return haystack.indexOf(needle);
    }

}
