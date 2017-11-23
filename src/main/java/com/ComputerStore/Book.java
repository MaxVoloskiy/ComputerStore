package com.ComputerStore;

public class Book extends Specificator implements Cloneable{

    private Specificator spec;

    public Book(String name, String author, int pages, int price, Type type) {
        super(name, author, pages, price, type);
    }

    Specificator getSpec() {
        return spec;
    }

}