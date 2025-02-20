import Config.FactoryConfiguration;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.close();
    }
}