package pl.sda.spring.mvc.mvcdatacontroler.tools;

import org.springframework.stereotype.Service;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.Client;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.ClientAddress;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientTestDataService {
    public List<Client> getClients() {
        Client c1 = new Client("Robert", "Silverberg");
        ClientAddress clientAddress1 = new ClientAddress("Sciegiennego 69/83");
        c1.setClientAddress(clientAddress1);
        Client c2 = new Client("Gal","Anonim");
        ClientAddress clientAddress2 = new ClientAddress("Adama Bochenka 20");
        c2.setClientAddress(clientAddress2);
        return Arrays.asList(c1,c2);
    }
}
