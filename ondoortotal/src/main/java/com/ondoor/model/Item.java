package com.ondoor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	private Long id;
	private String product;
	private String description;
	private String ingredient_desc;
	private Double quantity;
	private String packaging_type;
	private Double MRP;
	private Double purchase_rate;
	private Double orp;
	private String scheme;
	private Integer shelf_life;
	private String rate_mode;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredient_desc() {
		return ingredient_desc;
	}

	public void setIngredient_desc(String ingredient_desc) {
		this.ingredient_desc = ingredient_desc;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getPackaging_type() {
		return packaging_type;
	}

	public void setPackaging_type(String packaging_type) {
		this.packaging_type = packaging_type;
	}

	public Double getMRP() {
		return MRP;
	}

	public void setMRP(Double mRP) {
		MRP = mRP;
	}

	public Double getPurchase_rate() {
		return purchase_rate;
	}

	public void setPurchase_rate(Double purchase_rate) {
		this.purchase_rate = purchase_rate;
	}

	public Double getOrp() {
		return orp;
	}

	public void setOrp(Double orp) {
		this.orp = orp;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public Integer getShelf_life() {
		return shelf_life;
	}

	public void setShelf_life(Integer shelf_life) {
		this.shelf_life = shelf_life;
	}

	public String getRate_mode() {
		return rate_mode;
	}

	public void setRate_mode(String rate_mode) {
		this.rate_mode = rate_mode;
	}

}
