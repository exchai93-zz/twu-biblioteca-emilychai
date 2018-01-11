package com.twu.biblioteca;

import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void main() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        Biblioteca biblioteca = new Biblioteca(new PrintStream(outContent));
        String result = outContent.toString().trim();

        assertEquals("Prints a welcome message", "Welcome to Biblioteca!", result);

    }

}
