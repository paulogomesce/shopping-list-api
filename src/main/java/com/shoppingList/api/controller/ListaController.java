package com.shoppingList.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingList.domain.model.Lista;
import com.shoppingList.domain.service.ListaService;

@RestController
@RequestMapping("/listas")
public class ListaController {
	
	@Autowired
	private ListaService listaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Lista adicionar(@RequestBody Lista lista){
		return listaService.gravar(lista);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Lista> listar(){
		return listaService.listar();
	}
	
	@GetMapping("/{cdLista}")
	public ResponseEntity<Lista> pesqusar(@PathVariable Long cdLista){
		Lista listaPesquisada = listaService.pesquisar(cdLista);
		if (listaPesquisada != null ) {
			return ResponseEntity.ok(listaPesquisada);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Lista> atualizar(@PathVariable Long id,
			                               @RequestBody Lista listaAtualizada){
		Lista listaPesquisada = listaService.pesquisar(id);
		if (listaPesquisada != null ) {
			BeanUtils.copyProperties(listaAtualizada, listaPesquisada, "cdLista", "statusLista", "usuario", "dtCriacao", "dtFinalizacao");
			listaPesquisada = listaService.gravar(listaPesquisada);
			return ResponseEntity.ok(listaPesquisada);
		}
		return ResponseEntity.notFound().build();
	}	
}
