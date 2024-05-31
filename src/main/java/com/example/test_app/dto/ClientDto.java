package com.example.test_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String name;
    private String formeJuridique;
    private int immatriculation;
    private String marchedeCotation;
    private String contacts;
}
