package store;

/**
 * The Premium Customer is a child class of Customer
 * containing all the properties of customer
 * Discount for premium customer
 */
public class PremiumCustomer extends Customer {
    private int discount;

    public PremiumCustomer(int number, String name, String city, int discount) {
        super(number, name, city);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * This method returns all customer properties in string format
     *
     * @return Return all the Premium customer properties
     */
    @Override
    public String toString() {
        return "Premium Customer: " + this.getNumber() + " " + this.getName() + " " + this.getCity() + " " + this.discount + "%";
    }

}

