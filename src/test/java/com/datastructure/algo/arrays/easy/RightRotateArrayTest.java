package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RightRotateArrayTest {

    private RightRotateArray sut;

    @BeforeEach
    void initialize() {
        sut = new RightRotateArray();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testRotate(int[] arr, int rotateBy, int[] expected) {
        assertArrayEquals(expected, sut.rotate(arr, rotateBy));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1,2,3,4,5}, 1, new int[]{5,1,2,3,4}),
                arguments(new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4}),
                arguments(new int[]{1,2,3,4,5,6,7}, 2, new int[]{6,7,1,2,3,4,5}),
                arguments(new int[]{3,7,8,9,10,11}, 3, new int[]{9,10,11,3,7,8})
        );
    }

}
