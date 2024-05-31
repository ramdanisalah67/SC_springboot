package com.example.test_app.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {

    private int id;
    private String nom;
    private String motDePasse;


}
