package ru.amlet.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args) {
        getRow(4);
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        if (rowIndex == 0)
            return prevRow;
        prevRow.add(1);
        if (rowIndex == 1)
            return prevRow;
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> thisRow = new ArrayList<>(Collections.singleton(1));
            for (int j = 1; j < i; j++) {
                int topLeft = prevRow.get(j - 1);
                int topRight = prevRow.get(j);
                thisRow.add(topLeft + topRight);
            }
            thisRow.add(1);
            prevRow = thisRow;
        }
        return prevRow;
    }

}
