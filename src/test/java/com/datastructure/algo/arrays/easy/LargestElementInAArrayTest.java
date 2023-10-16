package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LargestElementInAArrayTest {

    private LargestElementInAArray sut;

    @BeforeEach
    void setUp() {
        sut = new LargestElementInAArray();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testfindLargestElement(int[] arr, int expected) {
        assertEquals(expected, sut.findLargestElement(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{2,5,1,3,0}, 5),
                arguments(new int[]{8,10,5,7,9}, 10)
        );
    }
}