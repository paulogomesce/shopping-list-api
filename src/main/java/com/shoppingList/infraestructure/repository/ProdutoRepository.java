package com.shoppingList.infraestructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.shoppingList.domain.model.Produto;

@Repository
public class ProdutoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Produto> listar(){
		TypedQuery<Produto> query = manager.createQuery("from Produto p", Produto.class);
		return query.getResultList();
	}
}
