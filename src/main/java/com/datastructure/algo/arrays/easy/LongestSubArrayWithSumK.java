package com.datastructure.algo.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public int find(int[] arr, long k) {
        return usingHashing(arr, k);
    }

    /**
     * Time Complexity: O(N3) approx., where N = size of the array.
     * Reason: We are using three nested loops, each running approximately N times.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int approachOne(int[] arr, long k) {
        int arrLength = arr.length; // size of the array.

        int length = 0;
        for (int i = 0; i < arrLength; i++) { // starting index
            for (int j = i; j < arrLength; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += arr[K];
                }

                if (s == k)
                    length = Math.max(length, (j - i )+ 1);
            }
        }
        return length;
    }

    /**
     * Time Complexity: O(N2) approx., where N = size of the array.
     * Reason: We are using two nested loops, each running approximately N times.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int approachTwo(int[] arr, long k) {
        int arrLength = arr.length; // size of the array.

        int length = 0;
        for (int i = 0; i < arrLength; i++) { // starting index
            int s =0;
            for (int j = i; j < arrLength; j++) { // ending index
                s+=arr[j];
                if (s == k)
                    length = Math.max(length, (j - i )+ 1);
            }
        }
        return length;
    }

    /**
     * Time Complexity: O(N) or O(N*logN) depending on which map data structure we are using, where N = size of the array.
     * Reason: For example, if we are using an unordered_map data structure in C++ the time complexity will be O(N)(though in the worst case,
     * unordered_map takes O(N) to find an element and the time complexity becomes O(N2)) but if we are using a map data structure,
     * the time complexity will be O(N*logN). The least complexity will be O(N) as we are using a loop to traverse the array.
     *
     * Space Complexity: O(N) as we are using a map data structure.
     */
    private int usingHashing(int[] arr, long k) {
        int arrLength = arr.length;
        int maxLength = 0;
        long sum = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();

        for (int index = 0; index < arrLength; index++) {
            sum+=arr[index];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLength = Math.max(maxLength, index+1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            // check whether the remainder is there or not and update max length
            if (preSumMap.containsKey(rem)) {
                maxLength = Math.max(maxLength, (index - preSumMap.get(rem)));
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, index);
            }
        }

        return maxLength;
    }
}
