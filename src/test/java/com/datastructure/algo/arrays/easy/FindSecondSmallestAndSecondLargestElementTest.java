package com.datastructure.algo.arrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSecondSmallestAndSecondLargestElementTest {

    private FindSecondSmallestAndSecondLargestElement sut;

    @BeforeEach
    void initialize() {
        sut = new FindSecondSmallestAndSecondLargestElement();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFindSecondSmallestAndLargest(int[] arr, int secondSmallest, int secondLargest) {
        FindSecondSmallestAndSecondLargestElement.ComputeResult computeResult = sut.findSecondSmallestAndLargest(arr);
        assertEquals(secondSmallest, computeResult.secondSmallest());
        assertEquals(secondLargest, computeResult.secondLargest());
    }

    static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new int[]{1, 2, 4, 6, 7, 5},2,6),
                arguments(new int[]{1,2,4,7,7,5}, 2, 5),
                arguments(new int[]{1}, -1,-1)
        );
    }

}
