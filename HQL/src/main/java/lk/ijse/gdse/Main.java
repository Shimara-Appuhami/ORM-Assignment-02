package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;  // Correct import

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
//all data
//        Query query = session.createQuery("from Person "); // Specify Person.class
//
//        List<Person> personList = query.list();
//        for (Person person : personList) {
//            System.out.println(person.getId());
//        }


        //unique data
//        Query query = session.createQuery("from Person where id =:id ");
//        query.setParameter("id","1");
//        Person person = (Person) query.uniqueResult();
//
//            System.out.println(person.getId());

//only one column
//        Query query = session.createQuery("select id,name from Person  where id = :id");
//        query.setParameter("id", "1");
//
//        Object[] result = (Object[]) query.uniqueResult();
//            String id = (String) result[0];
//            String name = (String) result[1];
//            System.out.println("ID: " + id);
//            System.out.println("Name: " + name);
//
//

        //update data
//        Query query = session.createQuery("update Person set name = :name where id = :id");
//        query.setParameter("name", "John ");
//        query.setParameter("id", "P1002");
//        query.executeUpdate();


        //delete data
//        Query query = session.createQuery("delete from Person where id = :id");
//        query.setParameter("id", "P1002");
//        query.executeUpdate();
//
//        //insert data
//
//        Person newPerson = new Person();
//        newPerson.setId("P1003");
//        newPerson.setName("Alice Doe");
//        session.save(newPerson);
//        System.out.println("successfully.");


//        Query query = session.createQuery("select id,name from Person where id=?1 ");
//        query.setParameter("1","P1003");
//        Person person = (Person) query.uniqueResult();
//            System.out.println(person.getName());

//        Query<Object[]> query = session.createQuery("select id, name from Person ");
//        List<Object[]> personList = query.list();
//
//        for (Object[] personData : personList) {
//            String id = (String) personData[0];
//            String name = (String) personData[1];
//
//            System.out.println("ID: " + id + ", Name: " + name);
//        }

//        Query query=session.createQuery("select a.aid,p.name from Address a inner join Person p on a.aid = p.id");
//        List<Object[]> personList = query.list();
//
//        for (Object[] person : personList) {
//            String aid = (String) person[0];
//            String name = (String) person[1];
//
//            System.out.println("Address ID: " + aid + ",  Name: " + name);
//        }


        transaction.commit();
        session.close();
    }
}
