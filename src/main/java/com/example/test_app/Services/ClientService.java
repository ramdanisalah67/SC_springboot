package com.example.test_app.Services;


import com.example.test_app.Models.Client;
import com.example.test_app.Repository.ClientRepository;
import com.example.test_app.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository ;


    public String ajouterClient(ClientDto c){

        Client client = new Client(null,c.getName(),c.getFormeJuridique(),
                Instant.now(),c.getImmatriculation(),c.getMarchedeCotation(),c.getContacts());

        clientRepository.save(client);

        return "client registred to database";
    }

    public List<Client> allClient(){

       return  clientRepository.findAll();

    }

    public void deleteClient(Long id){

       clientRepository.deleteById(id);

    }

    public void editClient(Client c){

        clientRepository.save(c);
    }

    public Client editClient(Long id){

      return   clientRepository.findById(id).get();
    }

}
