package com.twu.biblioteca;

import java.io.PrintStream;

public class Printer {

    private PrintStream printStream;

    public Printer(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Welcome to Printer!");
    }

    public void listBooks() {
        String[] bookList = {"Book_1", "Book_2", "Book_3"};
        String convertedBookList = String.join(", ", bookList);
        printStream.println(convertedBookList);
    }



}
