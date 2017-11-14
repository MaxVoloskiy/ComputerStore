package com.ComputerStore.Comparators;

import com.ComputerStore.Book;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByName implements Comparator<Book>, Serializable{

    public static final long serialVersionUID = -1928272309339693012L;

    public int compare(Book b1, Book b2){
        return b1.getName().compareTo(b2.getName());
    }

}