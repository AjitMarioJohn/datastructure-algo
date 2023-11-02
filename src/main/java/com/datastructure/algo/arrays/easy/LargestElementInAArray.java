package com.datastructure.algo.arrays.easy;

/**
 * Problem Statement: Given an array, we have to find the largest element in the array.
 *
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 *
 * Example2:
 * Input: arr[] = {8,10,5,7,9};
 * Output: 10
 * Explanation: 10 is the largest element in the array.
 */
public class LargestElementInAArray {

    public int findLargestElement(int[] arr) {
        return bruteForce(arr);
    }

    private int bruteForce(int[] arr) {
        int largestElement = 0;
        for (int element : arr) {
            if (largestElement < element) {
                largestElement = element;
            }
        }
        return largestElement;
    }

}
