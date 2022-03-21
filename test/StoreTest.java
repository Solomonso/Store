import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.Customer;
import store.Store;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store nike;
    private Customer solomon, femi, mercy;
    private HashSet<Customer> testCustomers = new HashSet<>();

    @BeforeEach
    void test() {
        nike = new Store("Nike");
        solomon = new Customer(3, "Solomon", "Benin City");
        femi = new Customer(4, "Femi", "Benin City");

        mercy = new Customer(6, "Mercy", "Emmen");
    }

    @Test
    void testAddCustomers() {

        this.nike.addCustomers(this.solomon);
    }

    @Test
    void testGetCustomers() {

        this.nike.addCustomers(this.solomon);
        this.testCustomers.add(this.solomon);

        assertEquals(nike.getCustomers(), testCustomers);
    }

    @Test
    void testGetPrefixAndCustomerNo() {
        this.nike.addCustomers(solomon);
        this.testCustomers.add(solomon);

        for (Customer c : testCustomers) {
            assertEquals(nike.getPrefixAndCustomerNo(), c.getPrefixAndCustomerNo() + " ");
        }

    }

    @Test
    void testFindCustomersByCity() {
     HashSet<Customer> test = new HashSet<>();
     test.add(mercy);
     this.nike.addCustomers(femi);
     this.nike.addCustomers(mercy);

        assertEquals(test, nike.findCustomersByCity("Emmen"));

    }

    @Test
    void testRemoveCustomer() {
        this.nike.addCustomers(solomon);
        this.testCustomers.add(solomon);
        nike.removeCustomerWithNoLowerThanInputNumber(solomon.getNumber());

        assertFalse(nike.removeCustomerWithNoLowerThanInputNumber(solomon.getNumber()));

    }

}
