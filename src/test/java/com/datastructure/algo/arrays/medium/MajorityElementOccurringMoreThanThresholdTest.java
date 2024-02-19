package com.datastructure.algo.arrays.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MajorityElementOccurringMoreThanThresholdTest {

    private MajorityElementOccurringMoreThanThreshold sut;

    @BeforeEach
    void initialize() {
        sut = new MajorityElementOccurringMoreThanThreshold();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFind(int[] arr, int expected) {
        assertEquals(expected, sut.find(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] {3,2,3}, 3),
                arguments(new int[] {2,2,1,1,1,2,2}, 2),
                arguments(new int[] {4,4,2,4,3,4,4,3,2,4}, 4),
                arguments(new int[] {4,4,2,3,3,4,4,4,2,4}, 4),
                arguments(new int[] {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5}, 5)
        );
    }

}
