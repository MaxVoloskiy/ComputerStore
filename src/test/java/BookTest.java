import com.ComputerStore.Book;
import com.ComputerStore.Specificator;
import com.ComputerStore.Type;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BookTest {

    Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);

    @Test
    public void getType() throws Exception{
        assertEquals(Type.BOOK, book.getType());
    }

    @Test
    public void getName() throws Exception{
        assertEquals("Lol", book.getName());
    }

    @Test
    public void getAuthor() throws Exception{
        assertEquals("Ivan Syusyura", book.getAuthor());
    }

    @Test
    public void getPages() throws Exception{
        assertEquals(243, book.getPages());
    }

    @Test
    public void getPrice() throws Exception{
        assertEquals(100, book.getPrice());
    }
}