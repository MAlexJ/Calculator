package com.epam.view;

public class ConsoleOut {

    public void print(Object str) {
        System.out.println(str.toString());
    }

    public void printErr(Object str) {
        System.err.println(str.toString());
    }
}
