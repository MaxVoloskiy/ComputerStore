import com.ComputerStore.Book;
import com.ComputerStore.Type;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    /**
     *
     */
    private Book book = new Book("Lol", "Ivan Syusyura", 243, 100, Type.BOOK);

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
        assertEquals(book.getPages(), 243);
    }

    @Test
    public void getPrice() throws Exception{
        assertEquals(100, book.getPrice());
    }
}