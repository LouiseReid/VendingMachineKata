import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {

    Tray tray;

    @Before
    public void before(){
        tray = new Tray(0.50, 10);
    }

    @Test
    public void trayHasAPrice(){
        assertEquals(0.50, tray.getPrice());
    }


}
