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
@Table(name = "sl_status_item_lista")
public class StatusItemLista{
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "cd_status_item")
	private Long cdStatusItem;
	
	@Column(name = "nm_status")
	private String nmStatus;
	
}
