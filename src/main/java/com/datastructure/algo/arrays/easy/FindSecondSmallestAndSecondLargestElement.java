package com.datastructure.algo.arrays.easy;

import java.util.Arrays;

public class FindSecondSmallestAndSecondLargestElement {
    public ComputeResult findSecondSmallestAndLargest(int[] arr) {
        return approach3(arr);
    }

    /**
     * Complexity Analysis
     * Time Complexity: O(NlogN), For sorting the array
     *
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private ComputeResult bruteForce(int[] arr) {
        ComputeResult result = new ComputeResult(-1, -1);
        int length = arr.length;
        if (length < 2) {
            return result;
        }

        Arrays.sort(arr);
        return new ComputeResult(arr[1], arr[length-2]);
    }

    /**
     * Time Complexity: O(N), We do two linear traversals in our array
     *
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private ComputeResult approach2(int[] arr) {
        ComputeResult result = new ComputeResult(-1, -1);
        int length = arr.length;
        if (length < 2) {
            return result;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int k : arr) {
            small = Math.min(small, k);
            large = Math.max(large, k);
        }

        for (int j : arr) {
            if (j < second_small && j != small) {
                second_small = j;
            }
            if (j > second_large && j != large) {
                second_large = j;
            }
        }

        return new ComputeResult(second_small, second_large);
    }

    /**
     * Time Complexity: O(N), Single-pass solution
     *
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private ComputeResult approach3(int[] arr) {
        ComputeResult result = new ComputeResult(-1, -1);
        int length = arr.length;
        if (length < 2) {
            return result;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j < small) {
                second_small = small;
                small = j;
            } else if (j < second_small && j != small) {
                second_small = j;
            }
            if (j > large) {
                second_large = large;
                large = j;
            } else if (j > second_large && j != large) {
                second_large = j;
            }
        }
        return new ComputeResult(second_small, second_large);
    }


    record ComputeResult(int  secondSmallest, int secondLargest){}
}
