package pl.sda.spring.mvc.mvcdatacontroler.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PrivateCar {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private Long weight;

    public PrivateCar() {
    }

    public PrivateCar(String brand, Long weight) {
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
