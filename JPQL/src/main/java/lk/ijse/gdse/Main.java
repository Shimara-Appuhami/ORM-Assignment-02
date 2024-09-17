package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Person;
import lk.ijse.gdse.entity.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // Insert using JPQL
//        Person newPerson = new Person("John", " Associates");
//        newPerson.setId("P1004");
//        newPerson.setName("Sam Smith");
//        session.save(newPerson);

        // Update using JPQL
//        Query updateQuery = session.createQuery("UPDATE Person p SET p.name = :name WHERE p.id = :id");
//        updateQuery.setParameter("name", "Updated Name");
//        updateQuery.setParameter("id", "P1004");
//        updateQuery.executeUpdate();

        // Delete using JPQL
//        Query deleteQuery = session.createQuery("DELETE FROM Person p WHERE p.id = :id");
//        deleteQuery.setParameter("id", "P1004");
//        deleteQuery.executeUpdate();

        // Search by name using JPQL
//        Query searchQuery = session.createQuery("FROM Person p WHERE p.name = :name");
//        searchQuery.setParameter("name", "Alice Doe");  // Use the parameter name "name", not an index.
//
//        List<Person> searchResults = searchQuery.getResultList();
//        for (Person person : searchResults) {
//            System.out.println("ID: " + person.getId() + ", Name: " + person.getName());
//        }


        // Join Query using JPQL (Person and Address)
//        Query joinQuery = session.createQuery(
//                "SELECT p.id, p.name, a.aid, a.city, a.street " +
//                        "FROM Person p JOIN p.addresses a"
//        );
//        List<Object[]> results = joinQuery.getResultList();
//
//        for (Object[] row : results) {
//            String personId = (String) row[0];
//            String personName = (String) row[1];
//            String addressId = (String) row[2];
//            String city = (String) row[3];
//            String street = (String) row[4];
//
//            System.out.println("Person ID: " + personId + ", Name: " + personName);
//            System.out.println("Address ID: " + addressId + ", City: " + city + ", Street: " + street);
//        }

        transaction.commit();
        session.close();
    }
}
