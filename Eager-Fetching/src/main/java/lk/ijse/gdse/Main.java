package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Person;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Person person=session.get(Person.class,"1");
        System.out.println(person.getId());
        System.out.println(person.getAddresses());



        transaction.commit();
        session.close();
    }
}