package com.datastructure.algo.arrays.easy;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    public int[] moveZeros(int[] arr) {
//        return bruteForce(arr);
        approach2(arr);
        return arr;
    }

    private int[] bruteForce(int[] arr) {
        int length = arr.length;
        int[] newArr = new int[length];
        Arrays.fill(newArr, 0);
        int index = 0;

        for (int element : arr) {
            if (element != 0) {
                newArr[index++] = element;
            }
        }

        return newArr;
    }

    /**
     * Time Complexity: O(N), N = size of the array.
     * Reason: We have used 2 loops and using those loops, we are basically traversing the array once.
     *
     * Space Complexity: O(1) as we are not using any extra space to solve this problem.
     * @param arr
     */
    private void approach2(int[] arr) {
        int j = -1;
        int length = arr.length;
        //place the pointer j:
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < length; i++) {
            if (arr[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }

    }
}
