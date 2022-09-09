package com.mateus.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
