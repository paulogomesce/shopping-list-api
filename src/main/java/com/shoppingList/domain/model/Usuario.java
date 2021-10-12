package com.shoppingList.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SL_USUARIO")
public class Usuario{

	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_usuario", sequenceName = "sq_usuario", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
	@Id
	@Column(name = "cd_usuario")
	private Long cdUsuario;
	
	@Column(name = "nm_completo")
	private String nmCompleto;	
	
	private String email;
	
	@JsonIgnore
	@JsonIgnoreProperties({ "internalId", "secretKey" })
	private String senha;
	
	@Column(name = "nu_ddd")
	private Long nuDdd;
	
	@Column(name = "nu_telefone")
	private Long nuTelefone;
	
	@Column(name = "dt_nascimento")
	private Date dtNascimento;	
	
}
