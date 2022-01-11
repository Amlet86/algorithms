package ru.amlet.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        generate(5);
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        List<Integer> previousList = new ArrayList<>();
        previousList.add(1);
        result.add(previousList);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= previousList.size(); j++) {
                if (j == 0) list.add(1);
                else if (j == previousList.size()) list.add(1);
                else {
                    int tmp = previousList.get(j - 1) + previousList.get(j);
                    list.add(j, tmp);
                }
            }
            result.add(list);
            previousList = list;
        }
        return result;
    }

}
