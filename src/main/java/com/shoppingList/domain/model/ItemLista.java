package com.shoppingList.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SL_ITEM_LISTA")
public class ItemLista{
	
	@Id
	@Column
	private Integer cdItem;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "cd_produto", name = "cd_produto")
	private Produto produto;
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;
	private Date dtCadastro;
	private Integer quantidade;
	private Integer valor;

	

}
