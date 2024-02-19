package com.datastructure.algo.arrays.medium;

public class SortArraysOfZerosOnesTwos {
    public int[] sort(int[] arr) {
        return bruteForce(arr);
    }

    private int[] bruteForce(int[] arr) {
        for (int turn =0; turn < 3; turn++) {
            for (int index = 0; index < arr.length - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
        return arr;
    }
}
