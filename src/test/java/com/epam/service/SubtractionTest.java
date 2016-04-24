package com.epam.service;

import com.epam.service.impl.Subtraction;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubtractionTest {
    @Test
    public void testCalc_01(){
        //given
        Arithmetic arithmetic = new Subtraction();

        //when
        double result = arithmetic.calculateValue(1, 2);

        //then
        assertEquals(-1.0, result);
    }

    @Test
    public void testCalc_02(){
        //given
        Arithmetic arithmetic = new Subtraction();

        //when
        double result = arithmetic.calculateValue(0, 2);

        //then
        assertEquals(-2.0, result);
    }

    @Test
    public void testCalc_03(){
        //given
        Arithmetic arithmetic = new Subtraction();

        //when
        double result = arithmetic.calculateValue(-1, 1);

        //then
        assertEquals(-2.0, result);
    }
}
