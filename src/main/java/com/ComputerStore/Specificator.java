package com.ComputerStore;

public class Specificator implements Cloneable{

    private String name, author;
    private int pages;
    public int price;
    Type type;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }


    public boolean theSame(Specificator phone){
        if (!phone.getName().equals(this.getName())){
            return false;
        }
        if (!phone.getAuthor().equals(this.getAuthor())){
            return false;
        }
        if (!phone.getType().equals(this.type)){
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
