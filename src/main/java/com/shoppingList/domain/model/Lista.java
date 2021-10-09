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
@Table(name = "SL_LISTA")
public class Lista{
	
	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_lista", sequenceName = "sq_lista", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_lista")
	@Id
	@Column(name = "cd_lista")
	private Long cdLista;
	
	@Column(name = "nm_lista")
	private String nomeLista;
	
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "cd_status_lista", referencedColumnName = "cd_status_lista")
	private StatusLista statusLista;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;
	
	@Column(name = "dt_criacao")
	private Date dtCriacao;
	
	@Column(name = "dt_finalizacao")
	private Date dtFinalizacao;
	
	//@OneToMany(mappedBy = "lista")
	//private List<ListaUsuarioConvidado> listaUsuarioConvidados = new ArrayList<ListaUsuarioConvidado>();

	

}
