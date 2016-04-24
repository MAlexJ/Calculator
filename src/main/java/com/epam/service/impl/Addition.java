package com.epam.service.impl;

import com.epam.service.Arithmetic;

public class Addition implements Arithmetic {
    @Override
    public double calculateValue(double first, double second) {
        return first + second;
    }
}
