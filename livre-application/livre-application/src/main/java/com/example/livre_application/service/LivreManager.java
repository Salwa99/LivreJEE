package com.example.livre_application.service;

import com.example.livre_application.dao.entities.Livre;
import com.example.livre_application.dao.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreManager implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public Livre addLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public List<Livre> getAllLivres() {
        return List.of();
    }

    @Override
    public Livre getLivreByLivre(String livre) {
        return null;
    }


    public Livre getLivreByTitre(String titre) {
        return livreRepository.findByTitre(titre);
    }

    public Livre getLivreByPublisher(String publisher) {
        return livreRepository.findByPublisher(publisher);
    }

    @Override
    public void deleteLivre(Long id) {

    }

}

