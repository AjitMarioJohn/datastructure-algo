package com.datastructure.algo.arrays.easy;

public class IsArraySorted {
    public boolean check(int[] arr) {
        return approach2(arr);
    }

    /**
     * Time Complexity: O(N)
     *
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private boolean approach1(int[] arr) {
        int length = arr.length;

        if (length < 1) {
            return false;
        }

        if (length == 1) {
            return true;
        }

        for (int i = 1; i < length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    /**
     * Time Complexity: O(N/2)
     *
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private boolean approach2(int[] arr) {
        int length = arr.length;

        if (length < 1) {
            return false;
        }

        if (length == 1) {
            return true;
        }

        int low = 1;
        int high = length- 2;
        int correspondingLowElement   = arr[0];
        int correspondingHighElement= arr[length - 1];

        while (low < high) {
            if (correspondingLowElement > arr[low]) {
                return false;
            }

            if (correspondingHighElement < arr[high]) {
                return false;
            }

            correspondingLowElement = arr[low];
            correspondingHighElement = arr[high];
            low++;
            high--;
        }

        return true;
    }
}
