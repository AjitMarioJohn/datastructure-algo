package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindGcdTest {

    private FindGcd sut;

    @BeforeEach
    void setUp() {
        sut = new FindGcd();
    }

    @ParameterizedTest
    @CsvSource({
            "4,8,4",
            "3,6,3"
    })
    public void testFindGcd(int num1, int num2, int expected) {
        assertEquals(expected, sut.findGcd(num1, num2));
    }
}
