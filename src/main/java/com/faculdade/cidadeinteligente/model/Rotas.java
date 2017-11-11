package com.faculdade.cidadeinteligente.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name="TB_ROTAS")
public class Rotas implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6545702277410343024L;

	@Id
	@GeneratedValue
	long id;
	
	@Column(name="NOME_ROTA",length=200,nullable=false)
	String nomeRota;
	
	@Column(name="LONGITUTEDE_LATITUDE", length=500, nullable=false)
	String longitudeLatitude;
	
	@Column(name="MEDIA")
	int media; 
}
