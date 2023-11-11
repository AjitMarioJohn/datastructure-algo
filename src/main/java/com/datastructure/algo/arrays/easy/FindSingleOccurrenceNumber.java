package com.datastructure.algo.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
 *
 * Example 1:
 * Input Format: arr[] = {2,2,1}
 * Result: 1
 * Explanation: In this array, only the element 1 appear once and so it is the answer.
 *
 * Example 2:
 * Input Format: arr[] = {4,1,2,1,2}
 * Result: 4
 * Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */
public class FindSingleOccurrenceNumber {
    public int findSingle(int[] arr) {
        return xor(arr);
    }

    private int usingHashing(int arr[]) {
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(0);
    }

    /**
     * Two important properties of XOR are the following:
     *
     * XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
     * XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
     *
     * Here all the numbers except the single number appear twice and so will form a pair. Now,
     * if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1.
     * The result will be = 0 ^ (single number) = single number (according to property 2).
     *
     *
     */

    private int xor(int[] arr) {
        int xor = 0;
        for(int element : arr) {
            xor = xor ^ element;
        }
        return xor;

//        return Arrays.stream(arr)
//                .reduce(0, (xor, element) -> xor ^ element);
    }
}
