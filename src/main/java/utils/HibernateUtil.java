package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e){
            throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
