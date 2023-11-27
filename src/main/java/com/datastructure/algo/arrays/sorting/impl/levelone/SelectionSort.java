package com.datastructure.algo.arrays.sorting.impl.levelone;

import com.datastructure.algo.arrays.sorting.Sorting;

public class SelectionSort implements Sorting {
    @Override
    public int[] sort(int[] arr) {
        int arrLength = arr.length;
        for (int i=0; i< arrLength; i++) {
            int miniIndex = i;
            for (int j=i+1; j< arrLength; j++) {
                if (arr[miniIndex] > arr[j]) {
                    miniIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;
        }
        return arr;
    }
}
