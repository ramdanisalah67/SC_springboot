package com.example.test_app.Controllers;


import com.example.test_app.Models.Client;
import com.example.test_app.Models.Message;
import com.example.test_app.Services.ClientService;
import com.example.test_app.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client/")
@CrossOrigin(origins = "*")
public class ClientControllers {

    @Autowired
    private ClientService clientService;

    @PostMapping("add")
    public Message saveClient(@RequestBody ClientDto client){
        System.out.println(client);
        clientService.ajouterClient(client);
      return new Message("client saved !!","200") ;
    }

    @GetMapping("allClient")
    public List<Client> list_of_client(){

       return  clientService.allClient();

    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){

       clientService.deleteClient(id);
       return "client deleted !!!" ;
    }

    @PutMapping("update")
    public String updateClient(@RequestBody Client client){

        clientService.editClient(client);
        return  "your client updated !!" ;
    }
}
