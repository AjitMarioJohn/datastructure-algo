package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestSubArrayWithSumKTest {
    private LongestSubArrayWithSumK sut;

    @BeforeEach
    void initialize() {
        sut = new LongestSubArrayWithSumK();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFind(int[] arr, int k, int expected) {
        assertEquals(expected, sut.find(arr, k));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] {2,3,5}, 5, 2),
                arguments(new int[] {2,3,5,1,9}, 10, 3),
                arguments(new int[] {10, 5, 2, 7, 1, 9}, 15, 4),
                arguments(new int[] {-5, 8, -14, 2, 4, 12}, -5, 5),
                arguments(new int[] {-1, 1, 1}, 1, 3)
        );
    }
}
