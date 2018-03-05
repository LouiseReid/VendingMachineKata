import org.junit.Before;

import java.util.HashMap;

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
        vendingMachine = new VeningMachine(products, 10.00);
    }
}
