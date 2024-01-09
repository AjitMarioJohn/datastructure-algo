package com.datastructure.algo.arrays.easy;

import java.util.Arrays;

public class LeftRotateArray {
    public int[] rotate(int[] arr, int rotateBy) {
        reverseAlgorithm(arr, rotateBy);
        return arr;
    }

    /**
     * Time Complexity O(n*k)
     * Space complexity is O(1)
     *
     * @param arr
     * @param rotateBy
     */
    private void bruteForce(int[] arr, int rotateBy) {
        int length = arr.length;

        if (length < 2) {
            return;
        }

        for (int count = 0; count < rotateBy; count++) {
            for (int index = 0; index < length-1; index++) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }
    }

    /**
     * Using reverse algorithm
     *
     * Time Complexity – O(N) where N is the number of elements in an array
     *
     * Space Complexity – O(1) since no extra space is required
     *
     * @param arr
     * @param rotateBy
     */
    private void reverseAlgorithm(int[] arr, int rotateBy) {
        int length = arr.length;

        // Reverse first k elements
        reverse(arr, 0, rotateBy - 1);
        // Reverse last n-k elements
        reverse(arr, rotateBy, length - 1);
        // Reverse whole array
        reverse(arr, 0, length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
