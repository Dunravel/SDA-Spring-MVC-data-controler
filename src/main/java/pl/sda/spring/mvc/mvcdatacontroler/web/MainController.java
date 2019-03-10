package pl.sda.spring.mvc.mvcdatacontroler.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.Client;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.ClientAddressRepository;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.ClientRepository;
import pl.sda.spring.mvc.mvcdatacontroler.tools.ClientTestDataService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientTestDataService clientTestDataService;

    @GetMapping("/read")
    public List<Client> readData(){
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll()
                .forEach(clients::add);
        return clients;
    }

    @GetMapping("/save")
    public void saveData() {
        List<Client> clients = clientTestDataService.getClients();
        clientRepository.saveAll(clients);
    }

    @GetMapping("/findByFirstName/{name}")
    public Client findByFirstName(@PathVariable("name") String firstName){
        return clientRepository.findClientByFirstName(firstName);
    }

    @GetMapping("/delete/{name}")
    public void deleteClient(@PathVariable("name") String name){
//        Client client = clientRepository.findClientByFirstName(name);
//        clientRepository.delete(client);
        List<Client> clients = clientRepository.findAllByFirstName(name);
        clientRepository.deleteAll(clients);
    }

}
