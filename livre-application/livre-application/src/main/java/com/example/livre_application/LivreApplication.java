package com.example.livre_application;

import com.example.livre_application.dao.entities.Livre;
import com.example.livre_application.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivreApplication implements CommandLineRunner {

	@Autowired
	private LivreService livreService;


	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		livreService.addLivre(new Livre(null, "Book1", "Publisher1", 120.00, "resume1"));
		livreService.addLivre(new Livre(null, "Book2", "Publisher2", 50.00, "resume2"));
		livreService.addLivre(new Livre(null, "Book3", "Publisher3", 200.00, "resume3"));
		livreService.addLivre(new Livre(null, "Book4", "Publisher4", 70.00, "resume4"));
		livreService.addLivre(new Livre(null, "Book5", "Publisher5", 88.00, "resume5"));

		System.out.println("Livres ajoutés :");
		livreService.getAllLivres().forEach(System.out::println);
	}


}
