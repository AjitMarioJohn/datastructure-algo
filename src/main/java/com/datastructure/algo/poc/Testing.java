package com.datastructure.algo.poc;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] hash = new int[5+1];
        int[] arr = new int[] {3,5,4,2};

        for (int i : arr) {
            hash[i]++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(hash));
    }
}
