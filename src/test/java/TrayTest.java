import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {

    Tray tray;
    Drink drink;
    Drink drink2;

    @Before
    public void before(){
        tray = new Tray(0.50, 10);
        drink = new Drink("Coke", 330);
        drink2 = new Drink("Irn Bru", 330);

    }

    @Test
    public void trayHasAPrice(){
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

    @Test
    public void stockLevelInitiallyZero(){
        assertEquals(0, tray.stockLevel());
    }

    @Test
    public void canAddItemToTray(){
        tray.addItem(drink);
        assertEquals(1, tray.stockLevel());
    }

    @Test
    public void canRemoveItemFromTray(){
        tray.addItem(drink);
        tray.addItem(drink2);
        assertEquals(drink, tray.removeProduct());
    }

    @Test
    public void cantAddItemsBeyondTraysCapacity(){
        for(int i = 0; i < tray.getCapacity() + 1; i++){
            tray.addItem(drink);
        }
        assertEquals(10, tray.stockLevel());
    }
}
