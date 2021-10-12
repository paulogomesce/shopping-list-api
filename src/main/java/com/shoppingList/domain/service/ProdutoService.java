package com.shoppingList.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingList.domain.model.Produto;
import com.shoppingList.infraestructure.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listar(){
		return produtoRepository.listar();
	}
	
	public Produto gravar(Produto produto) {
		return produtoRepository.gravar(produto);
	}
	
	public Produto pesquisar(Long cdproduto) {
		return produtoRepository.pesquisar(cdproduto);
	}
	
	public Produto pesquisarPorNomeIgual(String nomeProduto) {
		return produtoRepository.pesquisarPorNomeIgual(nomeProduto);
	}

}
