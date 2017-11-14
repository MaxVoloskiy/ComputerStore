import com.ComputerStore.Type;
import org.junit.Test;

import java.util.Objects;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TypeTest {
    @Test
    public void getString() throws Exception {
        Type testObject = Type.BOOK;
        assertEquals(testObject.getString(), Type.BOOK.getString());
        assertTrue(Objects.equals(testObject.getString(), "book"));
        testObject = Type.MAGAZINE;
        assertEquals(testObject.getString(), Type.MAGAZINE.getString());
        assertTrue(Objects.equals(testObject.getString(), "magazine"));
        testObject = Type.NEWSPAPER;
        assertEquals(testObject.getString(), Type.NEWSPAPER.getString());
        assertTrue(Objects.equals(testObject.getString(), "newspaper"));
        testObject = Type.LAZERS;
        assertEquals(testObject.getString(), Type.LAZERS.getString());
        assertTrue(Objects.equals(testObject.getString(), "Wrong"));
    }

}
