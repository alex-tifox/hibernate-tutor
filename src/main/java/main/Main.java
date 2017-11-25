package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import system.User;
import system.UserAdditionalData;


public class Main {

    public static void main(String[] args){

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();


        UserAdditionalData userAD = new UserAdditionalData();
        /*
        User user = new User();
        user.setName("Artem");
        user.setSurname("Artemiev");
        user.setAge(18);

        userAD.setAddress("Chopina");
        userAD.setCity("Szczecin");
        userAD.setCountry("Poland");

        user.setUserAdditionalData(userAD);
        session.save(user);
        */

        /*
        User user = session.get(User.class, 1);
        userAD.setCountry("Poland");
        userAD.setCity("Szczecin");
        userAD.setAddress("Akademik");

        user.setUserAdditionalData(userAD);
        session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();
        */

    }
}
