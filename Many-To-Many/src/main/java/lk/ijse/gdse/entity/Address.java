package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity

public class Address {
    @Id
    private String aid;
    private String street;
    private String city;
    @ManyToMany(mappedBy = "addresses")//inverse end
    private List<Person> personList;
    public Address() {
    }

    public Address(String aid, String street, String city, List<Person> personList) {
        this.aid = aid;
        this.street = street;
        this.city = city;
        this.personList = personList;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public List<Person> getPersonList() {
        return personList;
    }
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


}
