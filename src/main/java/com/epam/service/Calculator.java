package com.epam.service;

import com.epam.entity.Memory;
import com.epam.service.impl.Addition;
import com.epam.service.impl.Division;
import com.epam.service.impl.Multiplication;
import com.epam.service.impl.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Memory memory;
    private Arithmetic arithmetic;
    private Map<String, Arithmetic> map;

    {
        this.map = new HashMap<>();
        this.map.put("+", new Addition());
        this.map.put("-", new Subtraction());
        this.map.put("*", new Multiplication());
        this.map.put("/", new Division());
    }

    public Calculator(Memory memory) {
        this.memory = memory;
        this.arithmetic = map.get(memory.getArithmeticSign());
    }

    public double calculate() {
        return arithmetic.calculateValue(memory.getFirstNum(), memory.getSecondNum());
    }

}
