package com.mbenfredj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mbenfredj.dao.ProduitRepository;
import com.mbenfredj.entities.Produit;

@SpringBootApplication
public class MvcClientCatApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(MvcClientCatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.save(new Produit("Samsung Galaxy S8", 513, 100));
		produitRepository.save(new Produit("Xiaomi Mi A1", 173, 200));
		produitRepository.save(new Produit("Huawei Mate 10 Pro", 662, 220));
	}
}
