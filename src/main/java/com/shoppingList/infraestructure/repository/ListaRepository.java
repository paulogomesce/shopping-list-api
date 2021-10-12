package com.shoppingList.infraestructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingList.domain.model.ItemLista;
import com.shoppingList.domain.model.Lista;

@Repository
public class ListaRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public Lista gravar(Lista lista){
		return manager.merge(lista);
	}
	
	public Lista pesquisar(Long id) {
		return manager.find(Lista.class, id);
	}
	
	public List<Lista> listar(){
		TypedQuery<Lista> query = manager.createQuery("from Lista l", Lista.class);
		return query.getResultList();
	}
	
	@Transactional
	public void deletar(Lista lista) {
		manager.remove(lista);
	}
	
	@Transactional
	public ItemLista gravaItemLista(ItemLista itemLista) {
		return manager.merge(itemLista);
	}
	
}
