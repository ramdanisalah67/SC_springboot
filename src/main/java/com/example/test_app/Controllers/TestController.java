package com.example.test_app.Controllers;


import com.example.test_app.Models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test/")
public class TestController {



    @GetMapping("print")
    public String printMessage(){

        return "welcome nada to spring app ##welcome##";
    }

    @GetMapping("getClient")
    public Client getClient(){
            Client c = new Client();
            c.setName("spring boot app");
        return c ;
    }
}
