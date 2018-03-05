import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Louise", 10.00);
    }

    @Test
    public void customerHasName(){
        assertEquals("Louise", customer.getName());
    }

    @Test
    public void customerHasMoney(){
        assertEquals(10.00, customer.getPurse(), 0.01);
    }

    @Test
    public void customersProductsStartsOffAtZero(){
        assertEquals(0, customer.productsSize());
    }
}
