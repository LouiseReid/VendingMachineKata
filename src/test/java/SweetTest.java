import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet("Mars", 51);
    }

    @Test
    public void sweetHasName(){
        assertEquals("Mars", sweet.getName());
    }
}
