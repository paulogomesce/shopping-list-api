package com.shoppingList.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingList.domain.model.Produto;
import com.shoppingList.infraestructure.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController{

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Produto> listar(){
		return produtoRepository.listar();
	}
	
	
	

}
