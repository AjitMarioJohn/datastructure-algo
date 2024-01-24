package com.datastructure.algo.arrays.easy;

/**
 * Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
 *
 * Examples:
 *
 * Example 1:
 *
 * Input: prices = {1, 1, 0, 1, 1, 1}
 *
 * Output: 3
 *
 * Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
 *
 * Input: prices = {1, 0, 1, 1, 0, 1}
 *
 * Output: 2
 *
 * Explanation: There are two consecutive 1's in the array.
 */
public class MaximumConsecutiveOnes {

    /**
     * Time Complexity: O(N) since the solution involves only a single pass.
     * Space Complexity: O(1) because no extra space is used.
     */
    public int count(int[] arr) {
        int finalCount = 0;
        int count = 0;

        for (int num : arr) {
            if (num == 0) {
                count = 0;
            } else {
                count++;
            }
            finalCount = Math.max(finalCount, count);
        }

        return finalCount;
    }
}
