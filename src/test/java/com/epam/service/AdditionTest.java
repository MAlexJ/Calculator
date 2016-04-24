package com.epam.service;


import com.epam.service.impl.Addition;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdditionTest {

    @Test
    public void testCalc_01(){
        //given
        Arithmetic arithmetic = new Addition();

        //when
        double result = arithmetic.calculateValue(1, 2);

        //then
        assertEquals(3.0, result);
    }

    @Test
    public void testCalc_02(){
        //given
        Arithmetic arithmetic = new Addition();

        //when
        double result = arithmetic.calculateValue(0, 2);

        //then
        assertEquals(2.0, result);
    }

    @Test
    public void testCalc_03(){
        //given
        Arithmetic arithmetic = new Addition();

        //when
        double result = arithmetic.calculateValue(-1, 1);

        //then
        assertEquals(0.0, result);
    }
}
