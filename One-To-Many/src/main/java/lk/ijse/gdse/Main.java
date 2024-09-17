package lk.ijse.gdse;

import lk.ijse.gdse.entity.Address;
import lk.ijse.gdse.entity.Person;
import lk.ijse.gdse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Person person=new Person();

        person.setId("1");
        person.setName("Nimal");




        Address address1=new Address();
        address1.setAid("1");
        address1.setStreet("No 22");
        address1.setCity("Moratuwa");
        address1.setPerson(person);

        Address address2=new Address();
        address2.setAid("2");
        address2.setStreet("No 23");
        address2.setCity("panadura");

        address2.setPerson(person);



        ArrayList<Address> addresses=new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        session.save(address1);
        session.save(address2);
        session.save(person);

        transaction.commit();
        session.close();
    }
}