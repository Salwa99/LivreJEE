package com.example.livre_application.dao.repositories;

import com.example.livre_application.dao.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    Livre findByTitre(String titre );
    Livre findByPublisher(String publisher );
}