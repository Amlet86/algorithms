package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }

    private static int romanToInt(String s) {
        int result = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] array = s.split("");

        for (int i = 0; i < array.length; i++) {
            if((i+1) < array.length && map.get(array[i]) >= map.get(array[i+1])) {
                result += map.get(array[i]);
            } else if (i+1 == array.length) {
                result += map.get(array[i]);
            } else {
                result += (map.get(array[i+1]) - map.get(array[i]));
                i++;
            }
        }
        return result;
    }

}
