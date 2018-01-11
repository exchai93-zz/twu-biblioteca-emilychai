package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    private ByteArrayOutputStream outContent;
    private Biblioteca biblioteca;


    @Before
    public void before() {
        outContent = new ByteArrayOutputStream();
        biblioteca = new Biblioteca(new PrintStream(outContent));
    }


    @Test
    public void main() {
        String result = outContent.toString().trim();

        assertEquals("Prints a welcome message", "Welcome to Biblioteca!", result);

    }

    @Test
    public void listBooksAfterWelcomeMessage() {

        biblioteca.listBooks();

        String result = outContent.toString().split("\\n")[1];

        assertEquals("Prints a list of all the books", "Book_1, Book_2, Book_3", result);
    }

}
