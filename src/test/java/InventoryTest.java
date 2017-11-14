import com.ComputerStore.Book;
import com.ComputerStore.Inventory;
import com.ComputerStore.Type;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class InventoryTest {
    Inventory inventory;
    Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);

    public InventoryTest(){
        this.inventory = new Inventory();
        inventory.addBook("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
    }

    @Test
    public void addBook() throws Exception{
        List<Book> books = new LinkedList<Book>();
        books.add(book);
        assertTrue(books.equals(inventory.books));
    }

    @Test
    public void getBook() throws Exception{
        assertEquals(inventory.getBook("Lol"), book);
    }

    @Test
    public void search() throws Exception{
        List<Book> books = new LinkedList<Book>();
        books.add(book);
        List<Book> books1 = inventory.search(book);
        assertEquals(books, books1);
    }

}

