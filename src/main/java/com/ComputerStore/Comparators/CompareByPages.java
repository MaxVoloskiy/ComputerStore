package com.ComputerStore.Comparators;

import com.ComputerStore.Book;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByPages implements Comparator<Book>, Serializable{
    public int compare(Book b1, Book b2) {
        return -(b1.getPages() - b2.getPages());
    }
}