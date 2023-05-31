package lesson03.Problem01;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mohammad Jakaria", "Hossain", "23235");
        customer1.setShippingAddress(new Address("1000 N 4th Street", "Fairfield", "IA", "52557"));
        customer1.setBillingAddress(new Address("1000 N 4th Street", "Fairfield", "IA", "52557"));

        Customer customer2 = new Customer("Mak", "Daniel", "93235");
        customer2.setShippingAddress(new Address("1016 N 10th Street", "Chicago", "illinois", "87657"));
        customer2.setBillingAddress(new Address("1016 N 10th Street", "Chicago", "Illinois", "87657"));

        Customer customer3 = new Customer("Moynul", "Islam", "79235");
        customer3.setShippingAddress(new Address("1000 N 4th Street", "Fairfield", "IA", "52557"));
        customer3.setBillingAddress(new Address("1000 N 4th Street", "Fairfield", "IA", "52557"));

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getShippingAddress().getCity().equals("Chicago")) {
                System.out.println(customer.toString());
            }
        }
    }
}
