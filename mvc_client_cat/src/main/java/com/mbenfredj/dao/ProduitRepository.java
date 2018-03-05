package com.mbenfredj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbenfredj.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
