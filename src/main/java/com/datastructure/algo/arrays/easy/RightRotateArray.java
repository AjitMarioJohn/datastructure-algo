package com.datastructure.algo.arrays.easy;

public class RightRotateArray {
    public int[] rotate(int[] arr, int rotateBy) {
        jugglingAlgorithm(arr, rotateBy);
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
            for (int index = length - 1; index > 0; index--) {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
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
        // Reverse first n-k elements
        reverse(arr, 0, length - rotateBy - 1);
        // Reverse last k elements
        reverse(arr, length - rotateBy, length - 1);
        // Reverse whole array
        reverse(arr, 0, length - 1);
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

    private void jugglingAlgorithm(int[] arr, int rotateBy) {
        rotateBy = rotateBy % arr.length;
        if (rotateBy == 0) {
            return;
        }

        int gcd = gcd(rotateBy, arr.length);

        for (int i = 0; i < gcd; i++) {
            recursiveSwap(i, arr[i], rotateBy, i, arr);
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void recursiveSwap(int index, int value, int shift, int seed, int[] nums) {

        int nextIndex = (index + shift) % nums.length;
        int nextValue = nums[nextIndex];
        nums[nextIndex] = value;

        if (nextIndex == seed) return;

        recursiveSwap(nextIndex, nextValue, shift, seed, nums);
    }
}
