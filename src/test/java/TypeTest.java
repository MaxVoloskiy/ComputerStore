import com.ComputerStore.Type;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TypeTest {
    @Test
    public void getString() throws Exception {
        Type testObject = Type.BOOK;
        assertEquals(testObject.getString(), Type.BOOK.getString());
        testObject = Type.MAGAZINE;
        assertEquals(testObject.getString(), Type.MAGAZINE.getString());
        testObject = Type.NEWSPAPER;
        assertEquals(testObject.getString(), Type.NEWSPAPER.getString());
    }
}
