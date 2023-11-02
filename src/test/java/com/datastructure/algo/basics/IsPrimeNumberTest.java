package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPrimeNumberTest {

    private IsPrimeNumber sut;

    @BeforeEach
    void setup() {
        sut = new IsPrimeNumber();
    }

    @ParameterizedTest
    @CsvSource({
        "3,true",
        "26,false",
        "122977,false",
        "246692,false"
    })
    public void testIsPrimeNumber(int number, boolean expected) {
        assertEquals(expected, sut.isPrime(number));
    }

}
