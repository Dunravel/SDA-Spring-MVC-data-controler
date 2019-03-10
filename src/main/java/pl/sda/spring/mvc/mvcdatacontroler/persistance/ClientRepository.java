package pl.sda.spring.mvc.mvcdatacontroler.persistance;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findClientByFirstName(String firstName);
    List<Client> findAllByFirstName(String firstName);
}
