package com.datastructure.algo.arrays.sorting.impl.levelone;

import com.datastructure.algo.arrays.sorting.Sorting;

public class BubbleSort implements Sorting {
    @Override
    public int[] sort(int[] arr) {
        recursiveOptimizedForBestCase(arr, arr.length-1);
        return arr;
    }

    private int[] bruteForce(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
     *
     * Reason: If we carefully observe, we can notice that the recursion call, is occurring for n times, and for each recursion call, the loop j runs from 0 to n-2. For, the range of size n, the inner loop runs n-1 times, for the range of size n-1, the inner loop runs n-2 times, and so on. So, the total steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.
     *
     * Space Complexity: O(N) auxiliary stack space.
     */
    private void recursive(int[] arr, int length) {
        if (length < 1) {
            return;
        }

        for (int j = 0; j <=length-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        recursive(arr, length-1);
    }

    /**
     * Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
     *
     * Space Complexity: O(N) auxiliary stack space.
     */
    private void recursiveOptimizedForBestCase(int[] arr, int length) {
        if (length < 1) {
            return;
        }
        boolean didSwap = false;
        for (int j = 0; j <=length-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap) {
            return;
        }
        recursive(arr, length-1);
    }
}
