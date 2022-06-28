package ru.amlet.LeetCode;

public class ValidMountainArray {

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{1,1,1,1,1,1,1,2,1}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        } else {
            int biggest = arr[1];
            int biggestIndex = 1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > biggest) {
                    biggest = arr[i];
                    biggestIndex = i;
                }
            }

            if (arr[0] >= biggest || biggest <= arr[arr.length - 1]) {
                return false;
            }

            int tmpBI = biggestIndex;
            for (int j = tmpBI - 1; j >= 0; j--) {
                if (arr[j] >= arr[tmpBI]) {
                    return false;
                }
                tmpBI--;
            }

            tmpBI = biggestIndex;
            for (int j = tmpBI + 1; j < arr.length; j++) {
                if (arr[j] >= arr[tmpBI]) {
                    return false;
                }
                tmpBI++;
            }

            return true;
        }
    }
}

