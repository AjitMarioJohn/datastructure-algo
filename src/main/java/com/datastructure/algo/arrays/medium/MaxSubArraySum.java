package com.datastructure.algo.arrays.medium;

/**
 * Kadane’s Algorithm : Maximum Subarray Sum in an Array
 * Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
 * has the largest sum and returns its sum and prints the subarray.
 *
 * Example 1:
 *
 * Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
 *
 * Output: 6
 *
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Examples 2:
 *
 * Input: arr = [1]
 *
 * Output: 1
 *
 * Explanation: Array has only one element and which is giving positive sum of 1.
 */
public class MaxSubArraySum {
    public int find(int[] arr) {
        return usingKadanesAlgo(arr);
    }

    /**
     * Time Complexity: O(N2), where N = size of the array.
     * Reason: We are using two nested loops, each running approximately N times.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int bruteForce(int[] arr) {
        int length = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int firstIndex = 0; firstIndex < length; firstIndex++) {
            int prevSum = 0;
            for (int secondIndex = firstIndex; secondIndex < length; secondIndex++) {
                prevSum+=arr[secondIndex];
                maxSum = Math.max(maxSum, prevSum);
            }
        }
        return maxSum;
    }

    /**
     * Time Complexity: O(N), where N = size of the array.
     * Reason: We are using a single loop running N times.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int usingKadanesAlgo(int[] arr) {
        int length = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int index = 0; index < length; index++) {
            sum+=arr[index];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
