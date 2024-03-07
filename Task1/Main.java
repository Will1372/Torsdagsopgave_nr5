package Task1;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("William", "Øster", "William1372"));
        customers.add(new Customer("Benedicte", "Veileborg", "Bene0204"));

        printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers){

        for(Customer customer : customers){

            System.out.println(customer);

        }
    }
}