package com.ComputerStore.Comparators;

import com.ComputerStore.Book;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByAuthor implements Comparator<Book>, Serializable{

    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
