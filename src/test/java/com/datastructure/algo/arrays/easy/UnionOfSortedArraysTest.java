package com.datastructure.algo.arrays.easy;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UnionOfSortedArraysTest {

    private UnionOfSortedArrays sut;

    @BeforeEach
    void initialize() {
        sut = new UnionOfSortedArrays();
    }

    @ParameterizedTest
    @MethodSource("inputs")
    public void testFindUnion(List<Integer> listOne, List<Integer> listTwo, Set<Integer> expected) {
       assertThat(expected, is(equalTo(sut.findUnion(listOne, listTwo))));
    }

    public static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(List.of(1,2,3,4,5), List.of(2,3,4,4,5), Set.of(1,2,3,4,5)),
                arguments(List.of(2,3,4,5), List.of(1), Set.of(1,2,3,4,5)),
                arguments(List.of(1,2,3,4,5,6,7,8,9,10), List.of(2,3,4,4,5,11,12), Set.of(1,2,3,4,5,6,7,8,9,10,11,12))
        );
    }

}
