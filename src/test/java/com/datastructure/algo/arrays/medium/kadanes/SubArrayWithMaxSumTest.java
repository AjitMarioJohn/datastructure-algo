package com.datastructure.algo.arrays.medium.kadanes;

import com.datastructure.algo.arrays.medium.kadanes.SubArrayWithMaxSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubArrayWithMaxSumTest {

    private SubArrayWithMaxSum sut;

    @BeforeEach
    void initialize() {
        sut = new SubArrayWithMaxSum();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFind(int[] arr, int[] expected) {
        assertArrayEquals(expected, sut.find(arr));
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[] {-2,1,-3,4,-1,2,1,-5,4}, new int[] {4, -1, 2, 1}),
                arguments(new int[] {-3, -4, 5, -1, 2, -4, 6, -1}, new int[] {5, -1, 2, -4, 6}),
                arguments(new int[] {-2, 3, -1, 2}, new int[] {3, -1, 2}),
                arguments(new int[] {-2, -3, 4, -1, -2, 1, 5, -3}, new int[] {4, -1, -2, 1, 5}),
                arguments(new int[] {5,4,-1,7,8}, new int[] {5,4,-1,7,8}),
                arguments(new int[] {1}, new int[] {1})
        );
    }
}
