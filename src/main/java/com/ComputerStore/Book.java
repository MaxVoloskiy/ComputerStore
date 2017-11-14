package com.ComputerStore;

public class Book extends Specificator implements Cloneable{

    public Specificator spec;

    public Book(String name, String author, int pages, int price, Type type) {
        super(name, author, pages, price, type);
    }

    public Specificator getSpec() {
        return spec;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}