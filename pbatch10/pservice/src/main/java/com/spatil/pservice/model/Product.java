package com.spatil.pservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="PRODNAME")
	private String prodName;
	
	@Column(name="PRODDESC")
	private String prodDesc;
	
	private int price;
	private int qty;
		
}
