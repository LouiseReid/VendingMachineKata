import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Tray tray;


    @Before
    public void before(){
        tray = new Tray(0.50, 10);
        HashMap<Selection, Tray> products = new HashMap();

        for (Selection selection : Selection.values()){
            for(int i = 0; i < 5; i++){
                Sweet refreshers = new Sweet("refreshers", 10);
                tray.addItem(refreshers);
            }
            products.put(selection, tray);
        }
        vendingMachine = new VendingMachine(products, 10.00);
    }

    @Test
    public void testCoinsAddToCredit(){
        vendingMachine.addMoney(0.50);
        assertEquals(0.50, vendingMachine.getCredit(), 0.01);
        assertEquals(10.00, vendingMachine.getCash(), 0.01);
    }

    @Test
    public void testCanGiveRefund(){
        vendingMachine.addMoney(1.50);
        double refunded = vendingMachine.getRefund();
        assertEquals(0.00, vendingMachine.getCredit(), 0.01);
        assertEquals(1.50, refunded, 0.01);
        assertEquals(10.00, vendingMachine.getCash(), 0.01);

    }
}
