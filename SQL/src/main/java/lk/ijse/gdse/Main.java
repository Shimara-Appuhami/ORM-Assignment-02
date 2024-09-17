package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        //-Insert into-

//        NativeQuery query = session.createNativeQuery("INSERT INTO person (id, name) VALUES (?, ?)");
//        query.setParameter(1, "P1003");
//        query.setParameter(2, "Jane ");
//        query.executeUpdate();

        //-Update-
//        NativeQuery query = session.createNativeQuery("UPDATE person SET name =? WHERE id =?");
//        query.setParameter(1, "John ");
//        query.setParameter(2, "P1003");
//        query.executeUpdate();

        //-Delete-
//        NativeQuery query = session.createNativeQuery("DELETE FROM person WHERE id =?");
//        query.setParameter(1, "P1003");
//        query.executeUpdate();


        //-Search by name-
//        NativeQuery searchQuery = session.createNativeQuery("SELECT * FROM person WHERE name = ?");
//        searchQuery.setParameter(1, "Jane Doe");
//        searchQuery.addEntity(Person.class);
//
//        List<Person> searchResults = searchQuery.list();
//        for (Person person : searchResults) {
//            System.out.println("ID : " + person.getId() + ", Name: " + person.getName());
//        }
        //-join query-

        NativeQuery joinQuery = session.createNativeQuery(
                "SELECT p.id, p.name, a.aid, a.city, a.street " +
                        "FROM person p " +
                        "INNER JOIN address a ON p.id = a.person_id where id=?"
        );
        joinQuery.setParameter(1, "P1002");

        List<Object[]> searchResults = joinQuery.list();

        for (Object[] row : searchResults) {
            String personId = row[0].toString();
            String personName = row[1].toString();
            String addressId = row[2].toString();
            String city = row[3].toString();
            String street = row[4].toString();

            System.out.println("Person ID: " + personId + ", Name: " + personName);
            System.out.println("Address ID: " + addressId + ", City: " + city + ", Street: " + street);
        }


        transaction.commit();
        session.close();
    }
}