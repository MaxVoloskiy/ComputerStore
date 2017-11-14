package com.ComputerStore;

public class FindBookTester {

    public static void main(String[] ars){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Book whatErinLikes = new Book("Revolutioner", "Ivan Franko",
                 0, 0);

        Book book = inventory.search(whatErinLikes);
        if (book != null){
            System.out.println("Erin, you might like this " +
            book.getName() + " " + book.getAuthor() + " " +
            book.getPrice() + " UAH !");
        }else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        //Add books to the inventory
        inventory.addBook("Revolutioner", "Ivan Franko", 0, 0);
    }
}

