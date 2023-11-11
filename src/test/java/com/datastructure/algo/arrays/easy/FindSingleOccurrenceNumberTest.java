package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSingleOccurrenceNumberTest {

    private FindSingleOccurrenceNumber sut;

    @BeforeEach
    void setup() {
        sut = new FindSingleOccurrenceNumber();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFindNumber(int[] arr, int expected) {
        assertEquals(expected, sut.findSingle(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{2,2,1}, 1),
                arguments(new int[]{4,1,2,1,2}, 4)
        );
    }
}
