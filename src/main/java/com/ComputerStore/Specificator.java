package com.ComputerStore;

public class Specificator{

    private String name, author;
    private int pages;
    private int price;
    private Type type;

    public Specificator(String name, String author,
                        int pages, int price, Type type){
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }
    public Type getType() {
        return type;
    }

    public boolean theSame(Specificator book){

        if (!book.getName().equals(this.getName())){
            return false;
        }
        if (!book.getAuthor().equals(this.getAuthor())){
            return false;
        }
        return book.getType().equals(this.type);
    }

}
