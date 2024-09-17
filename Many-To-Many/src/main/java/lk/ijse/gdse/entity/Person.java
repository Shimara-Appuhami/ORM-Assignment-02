package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity

public class Person {//owners end
    @Id
    private String id;
    private String name;
    @ManyToMany
    private List<Address> addresses;

    public Person() {
    }

    public Person(String id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
