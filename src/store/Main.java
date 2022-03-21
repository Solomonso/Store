package store;

public class Main {
    public static void main(String[] args) {
        Store nike = new Store("nike");
        Customer solomon = new Customer(6, "solomon", "Emmen");
        Customer ese = new PremiumCustomer(8, "Ese", "Benin City", 20);
        Customer omone = new PremiumCustomer(1, "Omone", "Benin City", 10);
        Customer mercy = new PremiumCustomer(2, "Akowe", "BeninCity", 10);
        nike.addCustomers(solomon);
        nike.addCustomers(ese);
        nike.addCustomers(omone);
        nike.addCustomers(mercy);
    }
}
