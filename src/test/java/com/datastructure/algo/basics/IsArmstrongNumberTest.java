package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsArmstrongNumberTest {

    private IsArmstrongNumber sut;

    @BeforeEach
    void setup() {
        sut = new IsArmstrongNumber();
    }

    @ParameterizedTest
    @CsvSource({
            "153,true",
            "170,false",
            "1634,true"
    })
    public void testIsArmstrongNumber(int number, boolean expected) {
        assertEquals(expected, sut.isArmstrongNumber(number));
    }

}
