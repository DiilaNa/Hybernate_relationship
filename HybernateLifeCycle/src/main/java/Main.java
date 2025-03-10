import Config.FactoryConfiguration;
import Entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
       Customer customer = new Customer();
       customer.setName("John");

       session = FactoryConfiguration.getInstance().getSession();
       transaction = session.beginTransaction();

       /*Persistent state*/
/*       session.save(customer)*/
        session.persist(customer);
        transaction.commit();

        /*Detached state*/
        session.close();  /*after  session is closed no use*/

        /*edit object*/
        customer.setName("Jane");

        /*get new session*/
       session = FactoryConfiguration.getInstance().getSession();

       /*session.update(customer);*/
       session.merge(customer); /*merge is used instead of update*/

//        session.delete(customer); remove is used on for delete
        session.remove(customer);

        /*data fetching*/
      /*  eager fetching = one querry for all the parent data  */
      /*  lazy fetching = querry for each fetching , supplies on demand*/

    }
}