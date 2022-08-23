package com.example.Tirage.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "postulantrie")
public class PostulantTrie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String prenom;
    private String numero;
    private String email;

    @ManyToOne
    private Tirage tirage;
}
