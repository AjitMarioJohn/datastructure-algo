package com.datastructure.algo.arrays.sorting.impl.leveltwo;

import com.datastructure.algo.arrays.sorting.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting {
    /**
     * MergeSort logic says divide the array and then merge
     *
     * The time complexity of the merge sort algorithm is O(n log n) in the average case, O(n log n) in the worst case, and O(n log n) in the best case.
     *
     * The space complexity of the merge sort algorithm is O(n).
     *
     * This is because merge sort divides the array into halves, and then merges them together. Each time the array is divided,
     * the size of the array decreases by half, which gives us the log n factor. Since each division uses extra space to store the elements from the array,
     * the space complexity is O(n).
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low +high) / 2;

        mergeSort(arr, low, mid); // left side of array
        mergeSort(arr, mid+1, high); // right side of array
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int index = low; index <= high; index++) {
            arr[index] = temp.get(index - low);
        }
    }
}
