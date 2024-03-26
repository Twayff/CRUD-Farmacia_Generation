package com.generation.farmaciagtl.repository;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmaciagtl.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	

		public List<Produto> findAllByNomeProdutoContainingIgnoreCase(@Param("nomeProduto") String nomeProduto);

		}


