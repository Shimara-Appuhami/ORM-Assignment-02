package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Address {
    @Id
    private String aid;
    private String street;
    private String city;
    @ManyToOne
    private Person person;//owners.. end
    public Address() {
    }

    public Address(String aid, String street, String city, Person person) {
        this.aid = aid;
        this.street = street;
        this.city = city;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
