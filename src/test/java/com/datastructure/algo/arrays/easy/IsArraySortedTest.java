package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IsArraySortedTest {

    IsArraySorted sut;

    @BeforeEach
    void initialize() {
        sut = new IsArraySorted();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testCheck(int[] arr, boolean expected) {
        assertEquals(expected, sut.check(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, true),
                arguments(new int[]{1, 2, 5, 4, 3}, false)
        );
    }

}
