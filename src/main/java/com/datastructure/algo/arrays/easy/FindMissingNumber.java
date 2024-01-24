package com.datastructure.algo.arrays.easy;

import java.util.Arrays;

public class FindMissingNumber {
    public int find(int[] arr, int maxNumber) {
        return approach3(arr, maxNumber);
    }

    private int approach1(int[] arr, int maxNumber) {
        int incrementedValue = arr[0] + 1;

        System.out.println(Arrays.toString(arr));
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != incrementedValue) {
                return incrementedValue;
            }
            incrementedValue++;
        }

        return -1;
    }

    /**
     * Time Complexity: O(N) + O(N) ~ O(2*N),  where N = size of the array+1.
     * Reason: For storing the frequencies in the hash array, the program takes O(N) time complexity and for
     * checking the frequencies in the second step again O(N) is required. So, the total time complexity is O(N) + O(N).
     *
     * Space Complexity: O(N), where N = size of the array+1. Here we are using an extra hash array of size N+1.
     */
    private int approach2(int[] arr, int maxNumber) {
        int[] hash = new int[maxNumber + 1];

        for (int num : arr) {
            hash[num]++;
        }

        for (int index = 1; index <= maxNumber; index++) {
            if (hash[index] == 0) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Time Complexity: O(N), where N = size of array+1.
     * Reason: Here, we need only 1 loop to get the sum of the array elements. The loop runs for approx. N times. So, the time complexity is O(N).
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private int approach3(int[] arr, int maxNumber) {
        // Summation of first N element
        int sum = (maxNumber * (maxNumber + 1)) / 2;

        //Summation of all the element in a array
        int arrSum = 0;
        for (int element : arr) {
            arrSum += element;
        }

        return sum - arrSum;
    }
}
