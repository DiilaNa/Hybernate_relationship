import Config.FactoryConfiguration;
import Entity.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
/*
        Query<Customer> query= session.createQuery("select * from customer_table", Customer.class);
        List<Customer> customers = query.list();

        for (Customer customer : customers) {
            System.out.println(customer);
        }
        session.close();*/

        Query<Customer> query= session.createNativeQuery("select * from customer_table", Customer.class);
        List<Customer> customers = query.list();

        for (Customer customer : customers) {
            System.out.println(customer);
        }
        session.close();


    }
}