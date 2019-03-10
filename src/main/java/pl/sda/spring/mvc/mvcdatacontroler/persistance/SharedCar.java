package pl.sda.spring.mvc.mvcdatacontroler.persistance;

import javax.persistence.*;
import java.util.List;

@Entity
public class SharedCar {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private Long weight;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Client> clientList;

    public SharedCar() {
    }

    public SharedCar(String brand, Long weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
