package com.datastructure.algo.arrays.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaxSubArraySumTest {

    private MaxSubArraySum sut;

    @BeforeEach
    void initialize() {
        sut = new MaxSubArraySum();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFind(int[] arr, int expected) {
        assertEquals(expected, sut.find(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] { -2,1,-3,4,-1,2,1,-5,4 }, 6),
                arguments(new int[] { 1 }, 1)
        );
    }

}
