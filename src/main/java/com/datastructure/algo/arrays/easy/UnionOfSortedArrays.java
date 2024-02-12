package com.datastructure.algo.arrays.easy;

import org.hamcrest.Matcher;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionOfSortedArrays {
    public Set<Integer> findUnion(List<Integer> listOne, List<Integer> listTwo) {
        Set<Integer> union = new HashSet<>(listOne);
        union.addAll(listTwo);

        return union;
    }
}
