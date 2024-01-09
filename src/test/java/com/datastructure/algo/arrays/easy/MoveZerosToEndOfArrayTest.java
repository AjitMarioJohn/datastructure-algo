package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MoveZerosToEndOfArrayTest {

    private MoveZerosToEndOfArray sut;

    @BeforeEach
    void initialize() {
        this.sut = new MoveZerosToEndOfArray();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testMoveZeros(int[] arr, int[] expected) {
        assertArrayEquals(expected, sut.moveZeros(arr));
    }

    public static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1 ,0 ,2 ,3 ,0 ,4 ,0 ,1}, new int[]{1 ,2 ,3 ,4 ,1 ,0 ,0 ,0}),
                arguments(new int[]{1,2,0,1,0,4,0}, new int[]{1,2,1,4,0,0,0})
        );
    }

}
