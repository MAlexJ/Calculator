package com.epam.init;

import com.epam.service.Calculator;
import com.epam.util.AbstractValidation;

public class Main extends AbstractValidation {

    public static void main(String[] args) {
        consoleOut.print("Enter the first number and press 'Enter': ");
        addFirstNum();

        consoleOut.print("Enter the sing (+,-,*,/) and press 'Enter': ");
        addSing();

        consoleOut.print("Enter the second number and press 'Enter': ");
        addFSecondNum();

        consoleOut.print("Result operation: ");
        consoleOut.print(new Calculator(memory).calculate());
    }
}
