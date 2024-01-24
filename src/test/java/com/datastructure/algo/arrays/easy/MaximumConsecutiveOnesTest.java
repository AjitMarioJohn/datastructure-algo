package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumConsecutiveOnesTest {

    private MaximumConsecutiveOnes sut;

    @BeforeEach
    void initialize() {
        sut = new MaximumConsecutiveOnes();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testCount(int[] arr, int expected) {
        assertEquals(expected, sut.count(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1,1,0,1,1,1}, 3),
                arguments(new int[]{1,0,1,1,0,1}, 2)
        );
    }

}
