package com.shoppingList.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "usuario")
public class Usuario{

	@EqualsAndHashCode.Include
	@Id
	@Column(name = "cd_usuario")
	private Long cdUsuario;
	
	@Column(name = "nm_completo")
	private String nmCompleto;	
	
	private String email;
	private String senha;
	
	@Column(name = "nu_ddd")
	private Long nuDdd;
	
	@Column(name = "nu_telefone")
	private Long nuTelefone;
	
	@Column(name = "dt_nascimento")
	private Date dtNascimento;	
	
}
