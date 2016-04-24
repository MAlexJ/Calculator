package com.epam.util;

import com.epam.entity.Memory;
import com.epam.view.ConsoleIn;
import com.epam.view.ConsoleOut;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractValidation {
    protected static Memory memory;
    private static ConsoleIn consoleIn;
    protected static ConsoleOut consoleOut;

    static {
        memory = new Memory();
        consoleIn = new ConsoleIn();
        consoleOut = new ConsoleOut();
    }

    protected static void addFirstNum() {
        String num = consoleIn.read();
        while (!validateNum(num)) {
            consoleOut.printErr("Enter please number");
            num = consoleIn.read();
        }
        memory.setFirstNum(Double.parseDouble(num));
    }

    protected static void addFSecondNum() {
        String num = consoleIn.read();
        while (!validateNum(num)) {
            consoleOut.printErr("Enter please number");
            num = consoleIn.read();
        }
        memory.setSecondNum(Double.parseDouble(num));
    }

    private static boolean validateNum(String num) {
        try{
            Double.parseDouble(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    protected static void addSing() {
        String sing = consoleIn.read();
        while (!validateSing(sing)) {
            consoleOut.printErr("Enter please sing: +,-,*,/");
            sing = consoleIn.read();
        }
        memory.setArithmeticSign(sing);
    }

    private static boolean validateSing(String sing) {
        Pattern pt = Pattern.compile("[-+/*]");
        Matcher mt = pt.matcher(sing);
        return mt.matches();
    }
}
