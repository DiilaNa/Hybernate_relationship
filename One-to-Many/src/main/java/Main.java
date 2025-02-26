import Config.FactoryConfiguration;
import Entity.Customer;
import Entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setName("John Doe");
//
//        List<Order> orders = new ArrayList<>();
//
//        Order order1 = new Order();
//        order1.setOrderDate("2025/02/12");
//        order1.setCustomer(customer);
//
//        Order order2 = new Order();
//        order2.setOrderDate("2025/01/11");
//        order2.setCustomer(customer);
//
//        orders.add(order1);
//        orders.add(order2);
//
//        customer.setOrders(orders);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.save(customer);
//        transaction.commit();
//        session.close();

        FactoryConfiguration factoryConfiguration =FactoryConfiguration.getInstance();
        Session session = factoryConfiguration.getSession();
        Customer customer = session.get(Customer.class, 1);

        System.out.println(customer);

    }
}