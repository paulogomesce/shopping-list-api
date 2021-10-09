package com.shoppingList.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "sl_status_lista")
public class StatusLista{
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "cd_Status_Lista")
	private Long cdStatusLista;
	
	@Column(name = "nm_Status_Lista")
	private String nmStatusLista;
	
}
