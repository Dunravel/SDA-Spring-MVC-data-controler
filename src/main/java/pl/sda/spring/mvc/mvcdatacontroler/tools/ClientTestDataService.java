package pl.sda.spring.mvc.mvcdatacontroler.tools;

import org.springframework.stereotype.Service;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.Client;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.ClientAddress;
import pl.sda.spring.mvc.mvcdatacontroler.persistance.PrivateCar;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientTestDataService {
    public List<Client> getClients() {
        Client c1 = new Client("Robert", "Silverberg");
        ClientAddress clientAddress1 = new ClientAddress("Sciegiennego 69/83");
        c1.setClientAddress(clientAddress1);
        PrivateCar privateCar11 = new PrivateCar("Skoda", 1200L);
        PrivateCar privateCar12 = new PrivateCar("Mitsubishi", 1100L);
        List<PrivateCar> privateCars1 = Arrays.asList(privateCar11,privateCar12);
        c1.setPrivateCarList(privateCars1);

        Client c2 = new Client("Gal","Anonim");
        ClientAddress clientAddress2 = new ClientAddress("Adama Bochenka 20");
        c2.setClientAddress(clientAddress2);
        PrivateCar privateCar21 = new PrivateCar("Honda", 2200L);
        PrivateCar privateCar22 = new PrivateCar("Jeep", 4100L);
        PrivateCar privateCar23 = new PrivateCar("Mini", 900L);
        List<PrivateCar> privateCars2 = Arrays.asList(privateCar21,privateCar22,privateCar23);
        c2.setPrivateCarList(privateCars2);

        Client c3 = new Client("Stephen","King");
        ClientAddress clientAddress3= new ClientAddress("Dark Tower 1");
        c3.setClientAddress(clientAddress3);

        return Arrays.asList(c1,c2,c3);
    }
}
