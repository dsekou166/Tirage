package com.example.Tirage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostulantRepository extends JpaRepository<Postulant, Long> {

    public List<Postulant> findByListeId(Long liste_id);
}
