package com.datastructure.algo.arrays.medium.kadanes;


import java.util.Arrays;

public class SubArrayWithMaxSum {
    public int[] find(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;

        for (int index = 0; index < arr.length; index++) {
           sum += arr[index];

           if (sum > maxSum) {
               maxSum = sum;
               end = index;
           }

           if (sum < 0) {
               sum = 0;
               start = index + 1;
           }
        }

        int[] resultant = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println(Arrays.toString(resultant));
        return resultant;
    }
}
