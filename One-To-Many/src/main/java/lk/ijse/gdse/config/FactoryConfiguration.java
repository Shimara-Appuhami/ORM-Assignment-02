package lk.ijse.gdse.config;

import lk.ijse.gdse.entity.Address;
import lk.ijse.gdse.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private static SessionFactory sessionFactory;
    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Address.class);


        sessionFactory=configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?
                factoryConfiguration=new FactoryConfiguration():factoryConfiguration;


    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}


