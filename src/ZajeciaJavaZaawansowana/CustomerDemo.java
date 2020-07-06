package ZajeciaJavaZaawansowana;

public class CustomerDemo {

    public static void main(String[] args) {
        Customer customer = new Customer("Anna",27,false);
        Customer customer1 = new Customer();
        customer1.setName("Krzysztof");
        customer1.setAge(33);
        customer1.setPremium(true);
        Customer customer2 = new Customer("Basia", 22, false);

        customer.podajDane();
        System.out.println(customer.czyJestKlientemPremium());
        customer.awansujDoKlientaPremium();
        customer.wyprawUrodziny();
        System.out.println(customer.czyJestKlientemPremium());
        customer.podajDane();



    }
}


