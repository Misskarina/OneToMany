package com.karina.one_to_many;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	String pname;
	int price;
	int pqty;
	
	@ManyToOne(cascade=CascadeType.ALL)
	Company comapny;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public Company getComapny() {
		return comapny;
	}

	public void setComapny(Company comapny) {
		this.comapny = comapny;
	}
	
	

}
