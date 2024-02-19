package com.datastructure.algo.arrays.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Disabled
public class SortArraysOfZerosOnesTwosTest {

    private SortArraysOfZerosOnesTwos sut;

    @BeforeEach
    void initialize() {
        sut = new SortArraysOfZerosOnesTwos();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testSort(int[] arr, int[] expected) {
        assertArrayEquals(expected, sut.sort(arr));
    }

    public static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{2,0,2,1,1,0}, new int[]{0,0,1,1,2,2}),
                arguments(new int[]{2,0,1}, new int[]{0,1,2}),
                arguments(new int[]{0}, new int[]{0})
        );
    }

}
