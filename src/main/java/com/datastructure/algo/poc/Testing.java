package com.datastructure.algo.poc;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(maxSubarray(arr)));
    }

    public static int[] maxSubarray(int[] arr) {
        System.out.println(Arrays.toString(arr));;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum + arr[i]) {
                maxSum = arr[i];
                start = i;
            } else {
                maxSum += arr[i];
            }

            if (maxSum > 0) {
                end = i;
            } else if (maxSum <= 0) {
                maxSum = 0;
                tempStart = i + 1;
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
