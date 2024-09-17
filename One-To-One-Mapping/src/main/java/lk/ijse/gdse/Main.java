package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Address;
import lk.ijse.gdse.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();

        //person.setId("P001");
        person.setName("Nimal");

        Address address=new Address();
        address.setAid("A001");
        address.setStreet("123 Main St");
        address.setCity("Kandy");
        address.setPerson(person);




        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.save(person);
        session.save(address);

        transaction.commit();
        session.close();


    }
}