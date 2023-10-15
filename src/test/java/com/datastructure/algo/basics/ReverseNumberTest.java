package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    ReverseNumber sut;

    @BeforeEach
    public void setup() {
        sut = new ReverseNumber();
    }

    @ParameterizedTest
    @CsvSource({
            "12345, 54321",
            "987, 789",
            "0,0",
    })
    public void testReverseNumber(int number, int expected) {
        assertEquals(expected, sut.reverseNumber(number));
    }

}
