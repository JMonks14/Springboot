package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Tesco")
public class Sale {
	
	@Id
	@GeneratedValue
//	@Column(unique=true)
	private int salesid;
	@Column(name="productid")
	private int pid;
	@Column(length = 20, name="product")
	private String product_name;
	private int quantity;
	private float price;
	
	@Transient
	private float amount;
	@Transient
	private float vat;
	@Transient
	private float netamount;
	
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getVat() {
		return vat;
	}
	public void setVat(float vat) {
		this.vat = vat;
	}
	public float getNetamount() {
		return netamount;
	}
	public void setNetamount(float netamount) {
		this.netamount = netamount;
	}
	
	
	
	

}
