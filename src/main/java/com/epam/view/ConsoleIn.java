package com.epam.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class ConsoleIn {

    public String read() {
        String inputStream = null;
        try {
            inputStream = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (NoSuchElementException e) {
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }
}
