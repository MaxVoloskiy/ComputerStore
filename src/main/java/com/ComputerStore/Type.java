package com.ComputerStore;

public enum Type {

    BOOK, MAGAZINE, NEWSPAPER;

    public String getString(){
        switch (this){
            case BOOK:
                return "book";
            case MAGAZINE:
                return "magazine";
            case NEWSPAPER:
                return "newspaper";
            default:
                return "Wrong";
        }
    }
}