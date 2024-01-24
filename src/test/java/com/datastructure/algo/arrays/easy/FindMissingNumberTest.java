package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindMissingNumberTest {

    private FindMissingNumber sut;

    @BeforeEach
    void initialize() {
        sut = new FindMissingNumber();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFind(int[] arr, int maxNumber, int expected) {
        assertEquals(expected, sut.find(arr,maxNumber));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] {1,2,4,5}, 5, 3),
                arguments(new int[]{1,3}, 3, 2)
        );
    }
}
