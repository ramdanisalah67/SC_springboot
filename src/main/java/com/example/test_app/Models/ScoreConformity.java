package com.example.test_app.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreConformity {
    private int idScore;
    private double score;
    private int getIdutilisateur;
    private Instant dateEvaluation;
    private double resultat;
}
