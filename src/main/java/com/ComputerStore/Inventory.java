package com.ComputerStore;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Book> books;


    public Inventory(){ books = new ArrayList<>();}


    public void addBook(String name, String author,
                        int pages, int price, Type type){

        Book book = new Book(name, author, pages, price, type);
        books.add(book);
    }


    public Book getBook(String name){

        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }


    public List search(Book searchBook){

        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            String name = searchBook.getName();
            if (!name.equals("") && book.getSpec().theSame(searchBook.getSpec())) {
                continue;
            }
            matchingBooks.add(book);
        }

        return matchingBooks;
    }

    public List<Book> getBooks(){
        return books;
    }
}
