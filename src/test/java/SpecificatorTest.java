import com.ComputerStore.Specificator;
import com.ComputerStore.Type;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SpecificatorTest {

    Specificator specificator;

    public SpecificatorTest(){
        this.specificator = new Specificator("Lol", "Ivan Syusyura", 234, 200, Type.BOOK );
    }

    @Test
    public void getType() throws Exception{
        assertEquals(Type.BOOK, specificator.getType());
    }

    @Test
    public void getName() throws Exception{
        assertEquals("Lol", specificator.getName());
    }

    @Test
    public void getAuthor() throws Exception{
        assertEquals("Ivan Syusyura", specificator.getAuthor());
    }

    @Test
    public void getPages() throws Exception{
        assertEquals(234, specificator.getPages());
    }

    @Test
    public void getPrice() throws Exception{
        assertEquals(200, specificator.getPrice());
    }

    @Test
    public void theSame() throws Exception{
        Specificator specificator2 = new Specificator("Kek", "Taras Shevchenko", 540, 300, Type.BOOK);
        assertTrue(specificator.theSame(specificator2));
    }
}
