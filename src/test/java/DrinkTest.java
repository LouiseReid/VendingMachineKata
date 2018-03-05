import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before
    public void before(){
        drink = new Drink("Coke", 330);
    }

    @Test
    public void drinkHasName(){
        assertEquals("Coke", drink.getName());
    }
}
