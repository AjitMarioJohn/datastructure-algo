package com.datastructure.algo.arrays.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumTest {

    private TwoSum sut;

    @BeforeEach
    void initialize() {
        sut = new TwoSum();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFindPairs(int[] arr, int target, int[] expected) {
        assertArrayEquals(expected, sut.findPairs(arr, target));
    }


    public static Stream<Arguments> inputs() {
        return Stream.of(
          arguments(new int[]{2,6,5,8,11}, 14, new int[]{1,3}),
                arguments(new int[]{2,6,5,8,11}, 5, new int[]{-1, -1})
        );
    }
}
