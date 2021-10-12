package com.shoppingList.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SL_ITEM_LISTA")
public class ItemLista{
	
	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_item_lista", sequenceName = "sq_item_lista", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_item_lista")
	@Id
	@Column(name="cd_item")
	private Long cdItem;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "cd_produto", name = "cd_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;
	
	@Column(name = "dt_cadastro")
	private Date dtCadastro;
	
	private Integer quantidade;
	
	private Integer valor;	

}
