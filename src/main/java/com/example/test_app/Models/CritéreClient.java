package com.example.test_app.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CritéreClient {
    private int id;
    private String paysResidence;
    private boolean ppe;
    private boolean sanction;
    private String paysActivite;
    private String secteurActivite;
    private String incidentSecuritéfinanciére;
    private boolean fluxInternationaux;
    private String actifsConfiés;
    private String produits;
    private String canalsDestribution;

}
