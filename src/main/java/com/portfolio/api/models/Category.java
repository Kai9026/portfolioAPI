package com.portfolio.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Category implements Serializable{

	private static final long serialVersionUID = 259705787661756796L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCategory")
	private Integer idCategory;
	
	@Column(name = "nameCategory")
	private String nameCategory;
	
	@Column(name = "descriptionCategory")
	private String descriptionCategory;
	
}
