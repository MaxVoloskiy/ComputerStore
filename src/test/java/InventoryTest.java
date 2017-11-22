import com.ComputerStore.Book;
import com.ComputerStore.Inventory;
import com.ComputerStore.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class InventoryTest {

    @Test
    public void addBook() throws Exception{
        Inventory inventory = new Inventory();
        inventory.addBook("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book cbook = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        assertEquals(cbook.getSpec().getName(), inventory.getBook("Lol").getName());
    }

    @Test
    public void getBook() throws Exception{
        Inventory inventory = new Inventory();
        inventory.addBook("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        assertTrue(inventory.getBook("Lol").theSame(book));
    }

    @Test
    public void search() throws Exception{
        Inventory inventory = new Inventory();
        inventory.addBook("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book cbook = (Book) inventory.getBooks().get(0);
        assertEquals(cbook.getSpec().getName(), book.getSpec().getName());
    }

    @Test
    public void getBooks() throws Exception{
        Inventory inventory = new Inventory();
        inventory.addBook("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);
        Book cbook = (Book) inventory.getBooks().get(0);
        assertEquals(cbook.getSpec().getName(), book.getSpec().getName());
    }

}
