package com.datastructure.algo.arrays.sorting.impl.leveltwo;

import com.datastructure.algo.arrays.sorting.Sorting;

/**
 * Complexity
 * Time: Best O(nlog(n)), Average O(nlog(n)), Worst O(n²)
 * The worst case occurs when the greatest or smallest element is always picked as a pivot.
 * Space: O(n) for recursive call stacks
 * n: the total number of elements in the input array
 *
 * https://yuminlee2.medium.com/quicksort-algorithm-af62f8db8000
 */
public class QuickSort implements Sorting {
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        quickSort(arr, 0, n-1);
        return arr;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // taking last element of the array as pivot
        int pivot = arr[high];
        int pivotIndex = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                pivotIndex++;

                //swap element less than pivot to left
                swap(arr, pivotIndex, j);
            }
        }

        pivotIndex++;
        // swapping pivot to it's correct position
        swap(arr, pivotIndex, high);
        return pivotIndex;
    }

    private void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
