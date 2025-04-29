package com.example.livre_application.service;

import com.example.livre_application.dao.entities.Livre;

import java.util.List;

public interface LivreService {
    Livre addLivre(Livre livre);
    List<Livre> getAllLivres();
    Livre getLivreByLivre(String livre);
    void deleteLivre(Long id);
}