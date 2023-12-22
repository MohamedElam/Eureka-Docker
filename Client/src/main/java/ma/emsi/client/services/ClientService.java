package ma.emsi.client.services;

import ma.emsi.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.emsi.client.entity.Client;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository cr;

    public List<Client> findAll(){
        return cr.findAll();
    }

    public Client findById(Long id) throws Exception{
        return cr.findById(id).orElseThrow(()->new Exception("Invalid Client ID"));
    }
    public void addClient(Client client) {
        cr.save(client);
    }
}


