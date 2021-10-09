package com.shoppingList.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
}
