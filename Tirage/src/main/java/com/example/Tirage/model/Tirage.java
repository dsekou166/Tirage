package com.example.Tirage.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tirage")
public class Tirage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String date_tirage;

    @OneToMany
    private Set<PostulantTrie> postulantTries = new java.util.LinkedHashSet<>();

    public Set<PostulantTrie> getPostulantTries() {
        return postulantTries;
    }

    public void setPostulantTries(Set<PostulantTrie> postulantTries) {
        this.postulantTries = postulantTries;
    }
}
