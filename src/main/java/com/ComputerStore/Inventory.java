package com.ComputerStore;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    public List<Book> books;


    public Inventory(){
        books = new LinkedList<Book>();
    }


    public void addBook(String name, String author,
                        int pages, int price, Type type){

        Book book = new Book(name, author, pages, price, type);
        books.add(book);
    }


    public Book getBook(String name){

        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();){
            Book book = (Book)iterator.next();
            if (book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }


    public List<Book> search(Book searchBook){

        List<Book> matchingBooks = new LinkedList<Book>();
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
            Book book = (Book) iterator.next();
            String author = searchBook.getAuthor();
            if (book.getSpec().theSame(searchBook.getSpec())) {
                continue;
            }

            matchingBooks.add(book);
        }

        return matchingBooks;
    }
    ;
}
