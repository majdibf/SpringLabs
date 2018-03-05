package com.mbenfredj.web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbenfredj.dao.ProduitRepository;
import com.mbenfredj.entities.Produit;

@RestController
public class ProduitRestService {
	@Autowired
	ProduitRepository produitRepository;
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> listProduits(){
		return produitRepository.findAll();
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.GET)
	public Optional<Produit> getPrduitById(@PathVariable Long id) {
		return produitRepository.findById(id);
	}

	@RequestMapping(value="/produits", method=RequestMethod.POST)
	public Produit save(@RequestBody Produit p) {
		return produitRepository.save(p);
	}

	//Modification d'un produit
	@RequestMapping(value="/produits/{id}", method=RequestMethod.PUT)
	public Produit update(@PathVariable Long id, @RequestBody Produit p) {
		p.setId(id);
		return produitRepository.save(p);
	}

}
