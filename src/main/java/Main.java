import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Ryan Alexander on 10/10/2018.
 */
public class Main {
    public static void main(String[] args) {
     SessionFactory sessionFactory = Config.getSessionFactory();
     Session session = sessionFactory.openSession();

     Transaction transaction = session.beginTransaction();

     Prisoners prisoners = new Prisoners();
     prisoners.setId(13L);
     prisoners.setName("Viktor");
     prisoners.setCellNumber(9);
     prisoners.SetAlias("Vitya");
     prisoners.setFinalMeal(7);

     session.persist(prisoners);

     transaction.commit();

     session.close();
    }
}

