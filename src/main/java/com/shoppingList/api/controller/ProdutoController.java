package com.shoppingList.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingList.domain.model.Produto;
import com.shoppingList.infraestructure.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController{

	@Autowired
	private ProdutoRepository produtoService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Produto> listar(){
		return produtoService.listar();
	}
	
	@PostMapping
	public ResponseEntity<Produto> adicionar(@RequestBody Produto produto) {
		produto = produtoService.gravar(produto);
		return ResponseEntity.ok(produto);
	}
	
	@GetMapping("/{cdProduto}")
	public ResponseEntity<Produto> pesquisar(@PathVariable Long cdProduto){
		Produto produto = produtoService.pesquisar(cdProduto);
		if(produto != null) {
			return ResponseEntity.ok(produto);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/nomeigual/{nome}")
	public ResponseEntity<Produto> pesquisar(@PathVariable String nome){
		Produto produto = null;
		try {
			produto = produtoService.pesquisarPorNomeIgual(nome);
		}catch (EmptyResultDataAccessException e) {
			produto = null;
		}		
		if(produto != null) {
			return ResponseEntity.ok(produto);
		}
		return ResponseEntity.notFound().build();
	}	

}
