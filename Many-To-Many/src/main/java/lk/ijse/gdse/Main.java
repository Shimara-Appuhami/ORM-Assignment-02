package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Address;
import lk.ijse.gdse.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.getTransaction();

        Person person1= new Person();
        person1.setId("1");
        person1.setName("Kamal");

        Person person2=new Person();
        person2.setId("2");
        person2.setName("Perera");

        Address address1=new Address();
        address1.setAid("1");
        address1.setStreet("22");
        address1.setCity("Kandy");


        Address address2=new Address();
        address2.setAid("2");
        address2.setStreet("33");
        address2.setCity("Gampaha");






        List<Person> personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        List<Address> addressList=new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);

        person1.setAddresses(addressList);
        person2.setAddresses(addressList);

        address1.setPersonList(personList);
        address2.setPersonList(personList);

        transaction.begin();
        session.save(address1);
        session.save(address2);
        session.save(person1);
        session.save(person2);
        transaction.commit();
        session.close();
    }
}