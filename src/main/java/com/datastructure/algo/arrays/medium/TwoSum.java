package com.datastructure.algo.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] findPairs(int[] arr, int target) {
        return usingHashing(arr, target);
    }

    /**
     * Time Complexity: O(N2), where N = size of the array.
     * Reason: There are two loops(i.e. nested) each running for approximately N times.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int[] bruteForce(int[] arr, int target) {
        for (int first = 0; first < arr.length; first++) {
            for (int second = 0; second < arr.length; second++) {
                if (arr[first] + arr[second] == target) {
                    return new int[] {first, second};
                }
            }
        }
        return new int[] { -1, -1};
    }

    /**
     * Time Complexity: O(N), where N = size of the array.
     * Reason: The loop runs N times in the worst case and searching in a hashmap takes O(1) generally. So the time complexity is O(N).
     *
     * Note: In the worst case(which rarely happens), the unordered_map takes O(N) to find an element.
     * In that case, the time complexity will be O(N2). If we use map instead of unordered_map, the time complexity will be O(N* logN)
     * as the map data structure takes logN time to find an element.
     *
     * Space Complexity: O(N) as we use the map data structure.
     */
    private int[] usingHashing(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < arr.length; index++) {
            int remain = target - arr[index];

            if (map.containsKey(remain)) {
                return new int[] {map.get(remain), index};
            }
            map.put(arr[index], index);
        }
        return new int[] { -1, -1};
    }

    /**
     * Time Complexity: O(N) + O(N*logN), where N = size of the array.
     * Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.
     *
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int[] twoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (right > left) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            }

            if (sum > target) {
                right--;
            } else {
                left++;
            }

        }

        return new int[] { -1, -1};
    }
}
