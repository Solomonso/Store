package store;

/**
 * Customer is a parent of Premium Customer
 * Customer number
 * Name of a customer
 * City of the customer
 */
public class Customer {
    private int number;
    private String name;
    private String city;
    public static String prefix = "MM_";

    public Customer(int number, String name, String city) {
        this.number = number;
        this.name = name;
        this.city = city;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method returns a prefix and customer no
     * @return Returns the prefix with the customer no
     */
    public String getPrefixAndCustomerNo() {
        return prefix + this.getNumber();
    }

    /**
     * This Method returns all customer in a readable format
     *
     * @return Return all the properties of customer
     */
    @Override
    public String toString() {
        return this.getNumber() + " " + this.getName() + " " + this.getCity();
    }
}
