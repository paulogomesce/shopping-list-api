package com.shoppingList.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SL_CATEGORIA_PRODUTO")
public class CategoriaProduto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@SequenceGenerator(name = "sq_categoria_produto", sequenceName = "sq_categoria_produto", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_categoria_produto")
	@Column(name = "cd_categoria")
	private Long cdCategoria;
	
	@Column(name = "ds_categoria")
	private String dsCategoria;
	
}
