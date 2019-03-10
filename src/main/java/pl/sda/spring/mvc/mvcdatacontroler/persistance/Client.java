package pl.sda.spring.mvc.mvcdatacontroler.persistance;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    @OneToOne(cascade=CascadeType.ALL)
    private ClientAddress clientAddress;


    private List<PrivateCar> privateCarList;

    public Client(){

    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public List<PrivateCar> getPrivateCarList() {
        return privateCarList;
    }

    public void setPrivateCarList(List<PrivateCar> privateCarList) {
        this.privateCarList = privateCarList;
    }
}
