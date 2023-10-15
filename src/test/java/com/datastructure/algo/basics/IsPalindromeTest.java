package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPalindromeTest {

    private IsPalindrome sut;

    @BeforeEach
    public void setUp() {
        sut = new IsPalindrome();
    }

    @ParameterizedTest
    @CsvSource({
            "123,false",
            "121,true"
    })
    public void testIsPalindrome(int number, boolean expected) {
        assertEquals(expected, sut.isPalindrome(number));
    }

}
