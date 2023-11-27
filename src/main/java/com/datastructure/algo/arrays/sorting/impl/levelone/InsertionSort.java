package com.datastructure.algo.arrays.sorting.impl.levelone;

import com.datastructure.algo.arrays.sorting.Sorting;

/**
 * In insertion sort we consider that we have two arrays
 * one is sorted and another unsorted. At start we consider element at index zero
 * is sorted and starts our sorting from index one. Then as we iterate we pick one
 * element from unsorted array and try to place that in it's appropriate position
 * in sorted array
 *
 *
 */
public class InsertionSort implements Sorting {
    @Override
    public int[] sort(int[] arr) {
        return bruteForce(arr);
    }

    private int[] bruteForce(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    private void recursive(int[] arr, int n) {
        if (n < 1) {
            return;
        }
    }
}
