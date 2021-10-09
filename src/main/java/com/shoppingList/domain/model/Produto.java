package com.shoppingList.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SL_PRODUTO")
public class Produto {

	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_produto", sequenceName = "sq_produto", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_produto")
	@Id
	@Column(name = "cd_produto")
	private Long cdProduto;
	
	@ManyToOne
	@JoinColumn(name = "cd_categoria", referencedColumnName = "cd_categoria")
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	@JoinColumn(name = "cd_status", referencedColumnName = "cd_status")
	private StatusProduto statusProduto;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;
	
	@Column(name = "nm_produto")
	private String nomeProduto;
	
	@CreationTimestamp
	@Column(name = "dt_cadastro")
	private LocalDateTime dataCadastro;
	
	@UpdateTimestamp
	@Column(name = "dt_atualizacao")
	private LocalDateTime dataAtualizacao;
	
}
