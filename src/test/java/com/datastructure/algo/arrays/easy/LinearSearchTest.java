package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LinearSearchTest {

    private LinearSearch sut;

    @BeforeEach
    void initialize() {
        sut = new LinearSearch();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testMoveZeros(int[] arr, int numberToSearch, int expectedIndex) {
        assertEquals(expectedIndex, sut.search(arr, numberToSearch));
    }

    public static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1,2,3,4,5}, 3, 2),
                arguments(new int[]{5,4,3,2,1}, 5, 0),
                arguments(new int[]{5,4,3,2,1}, 12, -1)
        );
    }
}
