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
@Table(name = "SL_ESTABELECIMENTO")
public class Estabelecimento{

	@EqualsAndHashCode.Include
	@SequenceGenerator(name = "sq_estabelecimento", sequenceName = "sq_estabelecimento", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_estabelecimento")
	@Id
	@Column(name = "cd_estabelecimento")
	private Long cdEstabelecimento;
	
	@Column(name = "nm_stabelecimento")
	private String nomeEstabelecimento;

}
