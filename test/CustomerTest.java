import org.junit.jupiter.api.Test;
import store.Customer;
import store.PremiumCustomer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void testGetPrefixAndCustomerNo() {
        Customer solomon = new Customer(12,"Solomon","Emmen");
        PremiumCustomer joe = new PremiumCustomer(13,"Joe","Emmen",10);

       assertEquals("MM_"+12,Customer.prefix+solomon.getNumber());
       assertEquals("MM_"+12,PremiumCustomer.prefix+solomon.getNumber());
    }
}
