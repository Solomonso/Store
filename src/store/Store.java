package store;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Store class contains the customers.
 * Name of store.
 */
public class Store {
    private HashSet<Customer> customers;
    private String name;

    public Store(String name) {
        this.name = name;
        this.customers = new HashSet<>();
    }

    /**
     * @return Return all the customers in the store
     */
    public HashSet<Customer> getCustomers() {
        return this.customers;
    }

    /**
     * This method adds customers to the store
     * @param customer accepts customer object
     */
    public void addCustomers(Customer customer) {
        this.customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method gets all customers with their prefix and customer no.
     * @return Return all the Prefix and customer name.
     */
    public String getPrefixAndCustomerNo()
    {
        StringBuilder result = new StringBuilder();
        for(Customer customer: this.customers) {
            result.append(customer.getPrefixAndCustomerNo()).append(" ");
        }
        return result.toString();
    }

    /**
     * This method return all the customers from a city.
     * @param city accepts a String to represent the customer city.
     * @return Return the names of customer from a city.
     */
    public HashSet<Customer> findCustomersByCity(String city)
    {
        HashSet<Customer> customersByCity = new HashSet<>();
        for(Customer customer: this.customers)
        {
            if(customer.getCity().equalsIgnoreCase(city))
            {
                customersByCity.add(customer);
            }
        }

        return customersByCity;

    }

    /**
     * The Method remove all the customer, that has a customer number smaller than the number given.
     * @param number Accepts an integer
     */
    public boolean removeCustomerWithNoLowerThanInputNumber(int number)
    {
        boolean isRemoved = false;
        Iterator<Customer> iterator = this.customers.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().getNumber() < number)
            {
                iterator.remove();
                isRemoved = true;
            }
        }
        return isRemoved;
    }
}
