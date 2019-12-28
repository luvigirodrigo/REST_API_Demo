package com.myorg.RestDemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements Comparable<Product>, Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "PRODUCT_NAME", nullable = false, length = 100, updatable = true)
	private String productName;

	@Column(name = "VALUE", nullable = false, updatable = true)
	private double value;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int PRIME = 4;
		return this.productId * PRIME;
	}

	@Override
	public String toString() {
		return "[ " + this.productId + " , " + this.productName + " , " + this.value + " ] , hashCode : " + hashCode();
	}

	@Override
	public int compareTo(Product product) {
		return this.productId > product.getProductId() ? 1 : this.productId < product.getProductId() ? -1 : 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object instanceof Product) {
			Product product = (Product) object;
			if (product.getProductId() == this.productId && product.getProductName() == this.productName
					&& product.getValue() == this.value) {
				return true;
			}
		}
		return false;
	}

	public Product() {
		super();
	}

	public Product(int productId) {
		super();
		this.productId = productId;
	}

	public Product(String productName, double value) {
		super();
		this.productName = productName;
		this.value = value;
	}

	public Product(int productId, String productName, double value) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.value = value;
	}
}
