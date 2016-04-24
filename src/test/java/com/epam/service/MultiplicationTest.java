package com.epam.service;

import com.epam.service.impl.Multiplication;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplicationTest {

    @Test
    public void testCalc_01(){
        //given
        Arithmetic arithmetic = new Multiplication();

        //when
        double result = arithmetic.calculateValue(1, 2);

        //then
        assertEquals(2.0, result);
    }

    @Test
    public void testCalc_02(){
        //given
        Arithmetic arithmetic = new Multiplication();

        //when
        double result = arithmetic.calculateValue(0, 2);

        //then
        assertEquals(0.0, result);
    }

    @Test
    public void testCalc_03(){
        //given
        Arithmetic arithmetic = new Multiplication();

        //when
        double result = arithmetic.calculateValue(-1, 1);

        //then
        assertEquals(-1.0, result);
    }
}
