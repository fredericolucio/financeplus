package com.mycantec.financeplus.financeplus.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class Releases {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String description;
	@NotNull
	private int category;
	@Min(0)
	private Float  value;
	@NotNull
	private int account;
	@NotBlank
	private String status;
	
	
	public Releases() {
		
		}
	
	public Releases(String description, int category, Float value, int account, String status) {
		super();
		this.description = description;
		this.category = category;
		this.value = value;
		this.account = account;
		this.status = status;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategoryId() {
		return category;
	}

	public void setCategoryId(int category) {
		this.category = category;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public int getAccountId() {
		return account;
	}

	public void setAccountId(int account) {
		this.account = account;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	
	
	
}
