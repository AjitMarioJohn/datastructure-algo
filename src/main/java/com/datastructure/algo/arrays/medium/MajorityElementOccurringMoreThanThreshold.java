package com.datastructure.algo.arrays.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the Majority Element that occurs more than N/2 times
 * Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
 * You may consider that such an element always exists in the array.
 *
 * Example 1:
 * Input Format: N = 3, nums[] = {3,2,3}
 * Result: 3
 * Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.
 *
 * Example 2:
 * Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
 *
 * Result: 2
 *
 * Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.
 *
 * Example 3:
 * Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
 *
 * Result: 4
 *
 */
public class MajorityElementOccurringMoreThanThreshold {

    public int find(int[] arr) {
        return usingMooresVotingAlgorithm(arr);
    }

    /**
     * Time Complexity: O(N*logN) + O(N), where N = size of the given array.
     * Reason: We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements.
     * So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times. If we use unordered_map instead,
     * the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
     *
     * Space Complexity: O(N) as we are using a map data structure.
     */
    private int usingHashMap(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int threshold = arr.length / 2;

        for (int element : arr) {
            countMap.computeIfPresent(element, (key, value) -> value + 1);
            countMap.putIfAbsent(element, 1);

//            int value = countMap.getOrDefault(element, 0);
//            countMap.put(element, value + 1);
        }

        for (int key : countMap.keySet()) {
            int value = countMap.get(key);
            if (value > threshold) {
                return key;
            }
        }
        return -1;
    }

    /**
     * Boyer-Moore Majority Voting Algorithm:
     *
     * Time Complexity: O(N) + O(N), where N = size of the given array.
     * Reason: The first O(N) is to calculate the count and find the expected majority element.
     * The second one is to check if the expected element is the majority one or not.
     *
     * Note: If the question states that the array must contain a majority element, in that case, we do not need the second check.
     * Then the time complexity will boil down to O(N).
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int usingMooresVotingAlgorithm(int[] arr) {
        int length = arr.length;
        int threshold = length / 2;
        int count = 0;
        int element = -1;

        for (int elementAtIndex : arr) {
            if (count == 0) {
                count++;
                element = elementAtIndex;
            } else if (element == elementAtIndex) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int elementAtIndex : arr) {
            if (element == elementAtIndex) {
                count1++;
            }
        }
        if (count1 > threshold) {
            return element;
        }

        return -1;
    }
}
