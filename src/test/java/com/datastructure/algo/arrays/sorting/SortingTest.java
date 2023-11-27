package com.datastructure.algo.arrays.sorting;

import com.datastructure.algo.arrays.sorting.impl.levelone.BubbleSort;
import com.datastructure.algo.arrays.sorting.impl.leveltwo.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortingTest {

    private Sorting sut;

    @BeforeEach
    void setup() {
//        sut = new SelectionSort();
//        sut = new BubbleSort();
//        sut = new InsertionSort();
//        sut = new MergeSort();
        sut = new QuickSort();
    }

    @ParameterizedTest
    @MethodSource("input")
    void sort(int[] input, int[] expected) {
        assertArrayEquals(expected, sut.sort(input));
    }

    private static Stream<Arguments> input(){
        return Stream.of(
                arguments(new int[]{7,5,9,2,8}, new int[] {2,5,7,8,9}),
                arguments(new int[]{5,3,4,2,1,6}, new int[] {1,2,3,4,5,6}),
                arguments(new int[]{13,46,24,52,20,9}, new int[] {9,13,20,24,46,52}),
                arguments(new int[]{4,2,1,6,7}, new int[]{1,2,4,6,7}),
                arguments(new int[]{3,2,8,5,1,4,23}, new int[]{1,2,3,4,5,8,23})
        );
    }
}