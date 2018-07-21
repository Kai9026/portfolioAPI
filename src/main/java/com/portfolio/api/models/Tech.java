package com.portfolio.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "techs")
public class Tech implements Serializable{

	private static final long serialVersionUID = -8439882006398978061L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idTech")
	private Integer idTech;
	
	@Column(name = "nameTech")
	private String nameTech;
	
	@Column(name = "descriptionTech")
	private String descriptionTech;
	
	@Column(name = "knowledgeLevel")
	private Integer knowledgeLevel;
	
	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;	

}
