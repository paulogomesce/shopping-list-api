package com.shoppingList.infraestructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingList.domain.model.Produto;

@Repository
public class ProdutoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Produto> listar(){
		TypedQuery<Produto> query = manager.createQuery("from Produto p", Produto.class);
		return query.getResultList();
	}
	
	@Transactional
	public Produto gravar(Produto produto) {
		return manager.merge(produto);
	}
	
	public Produto pesquisar(Long cdproduto) {
		return manager.find(Produto.class, cdproduto);
	}
	
	public Produto pesquisarPorNomeIgual(String nomeProduto) {
		TypedQuery<Produto> query = manager.createQuery("from Produto p where upper(p.nomeProduto) = upper(:nomeProduto)", Produto.class);
		
		query.setFirstResult(0)
			 .setParameter("nomeProduto", nomeProduto)
			 .setMaxResults(1)
			 .getSingleResult();
		
		return query.getSingleResult();
	}
}
