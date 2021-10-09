package com.shoppingList.domain.model;

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
@Table(name = "SL_LISTA_USUARIO_CONVIDADO")
public class ListaUsuarioConvidado {
	
	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_lista_usuario_convidado", sequenceName = "sq_lista_usuario_convidado", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_lista_usuario_convidado")
	@Id
	@Column(name = "cd_Convite_Lista")
	private Long cdConviteLista;
	
	@ManyToOne
	@JoinColumn(name = "cd_lista", referencedColumnName = "cd_lista")
	private Lista lista;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;
	
}
