package com.shoppingList.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingList.domain.model.ItemLista;
import com.shoppingList.domain.model.Lista;
import com.shoppingList.infraestructure.repository.ListaRepository;

@Service
public class ListaService {
	
	@Autowired
	private ListaRepository listaRepository;
	
	public Lista gravar(Lista lista){
		if(lista.getCdLista() == null) {
			lista.setDtCriacao(new Date());
		}
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
	
	public ItemLista gravaItemLista(ItemLista itemLista) {
		if(itemLista.getDtCadastro() == null) {
			itemLista.setDtCadastro(new Date());//TODO: trocar por optional
		}
		if(itemLista.getValor() == null) {
			itemLista.setValor(0);//TODO: trocar por optional
		}
		return listaRepository.gravaItemLista(itemLista);
	}

}
