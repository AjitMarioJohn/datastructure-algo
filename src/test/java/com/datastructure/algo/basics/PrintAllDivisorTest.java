package com.datastructure.algo.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrintAllDivisorTest {

    private PrintAllDivisor printAllDivisor;

    @BeforeEach
    void setup() {
        printAllDivisor = new PrintAllDivisor();
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({})
    public void testPrintDivisor() {

    }
}
