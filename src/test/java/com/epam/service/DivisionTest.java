package com.epam.service;

import com.epam.service.impl.Division;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivisionTest {
    @Test
    public void testCalc_01(){
        //given
        Arithmetic arithmetic = new Division();

        //when
        double result = arithmetic.calculateValue(1, 2);

        //then
        assertEquals(0.5, result);
    }

    @Test
    public void testCalc_02(){
        //given
        Arithmetic arithmetic = new Division();

        //when
        double result = arithmetic.calculateValue(0, 1);

        //then
        assertEquals(0.0, result);
    }

    @Test
    public void testCalc_03(){
        //given
        Arithmetic arithmetic = new Division();

        //when
        double result = arithmetic.calculateValue(-1, 1);

        //then
        assertEquals(-1.0, result);
    }
}
