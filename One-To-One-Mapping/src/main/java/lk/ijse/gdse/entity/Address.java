package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class Address {
    @Id
    private String aid;
    private String street;
    private String city;
    @OneToOne
//    @JoinColumn(name = "person_id")
//    @JoinColumn(nullable = true)
//    @JoinColumn(referencedColumnName = "person_id")

    private Person person;

    public Address() {
        this.aid = aid;
        this.street = street;
        this.city = city;
        this.person = person;//owners end
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String pid) {
        this.aid = pid;
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
