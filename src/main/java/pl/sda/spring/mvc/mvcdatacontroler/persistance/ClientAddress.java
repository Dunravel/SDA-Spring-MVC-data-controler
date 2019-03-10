package pl.sda.spring.mvc.mvcdatacontroler.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientAddress {
    @Id
    @GeneratedValue
    private Long id;
    private String street;
    private String postCode;
    private String city;
    private String country;

    public ClientAddress() {
    }

    public ClientAddress(String street) {
        this.street = street;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
