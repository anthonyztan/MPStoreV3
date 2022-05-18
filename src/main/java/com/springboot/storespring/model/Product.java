package com.springboot.storespring.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="product")
public class Product {
	@Id
    @Column(name = "productName")
    @JsonProperty("product_name")
	String product_name;
	
	@Column(name = "productDesc")
    @JsonProperty("product_desc")
    String product_desc;
	
	public Product (String name, String desc) {
		this.product_name = name;
		this.product_desc = desc;
	}
	
	public Product () {
		
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
}
