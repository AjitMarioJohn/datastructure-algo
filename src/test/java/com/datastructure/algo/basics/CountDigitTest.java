package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDigitTest{

    private CountDigit sut;

    @BeforeEach
    public void setUp(){
        sut = new CountDigit();
    }

    @ParameterizedTest
    @CsvSource({
            "12345, 5",
            "8394, 4"
    })
    public void testCountDigit(int number, int expectedResult) {
        assertEquals(expectedResult, sut.countDigit(number));
    }

}