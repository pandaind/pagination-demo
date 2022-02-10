package com.demo.pagination.product;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID = -1097063233173286295L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
}
