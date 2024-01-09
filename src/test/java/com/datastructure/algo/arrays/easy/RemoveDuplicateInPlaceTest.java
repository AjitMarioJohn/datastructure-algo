package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicateInPlaceTest {
    private RemoveDuplicateInPlace sut;

    @BeforeEach
    void initialize() {
        sut = new RemoveDuplicateInPlace();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testRemoveDuplicate(int[] arr, int expectedCount) {
        int prevNumber = Integer.MIN_VALUE;
        int count = sut.removeDuplicate(arr);
        assertEquals(expectedCount, count);
        for (int i=0; i < count; i++) {
            int element = arr[i];
            assertNotEquals(prevNumber, element);
            prevNumber = element;
        }
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
          arguments(new int[]{1,1,2,2,2,3,3}, 3),
                arguments(new int[]{1,1,1,2,2,3,3,3,3,4,4}, 4)
        );
    }
}
