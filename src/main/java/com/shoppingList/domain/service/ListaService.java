package com.shoppingList.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingList.domain.model.Lista;
import com.shoppingList.infraestructure.repository.ListaRepository;

@Service
public class ListaService {
	
	@Autowired
	private ListaRepository listaRepository;
	
	public Lista gravar(Lista lista){
		lista.setDtCriacao(new Date());
		return listaRepository.gravar(lista);
	}
	
	public Lista pesquisar(Long id) {
		return listaRepository.pesquisar(id);
	}
	
	public List<Lista> listar(){
		return listaRepository.listar();
	}
	
	public void deletar(Lista lista) {
		listaRepository.deletar(lista);
	}
}
