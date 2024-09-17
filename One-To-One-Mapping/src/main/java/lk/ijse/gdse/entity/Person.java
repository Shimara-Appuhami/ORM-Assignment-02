package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Person {//inverse end
    @Id
    private String id;
    private String name;



    public Person() {
    }

    public Person(String id, String name, Address address) {
        this.id = id;
        this.name = name;

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


}
