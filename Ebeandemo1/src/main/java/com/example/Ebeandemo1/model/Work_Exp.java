package com.example.Ebeandemo1.model;

import java.io.Serializable;

public class Work_Exp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	int exp_years;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExp_years() {
		return exp_years;
	}
	public void setExp_years(int exp_years) {
		this.exp_years = exp_years;
	}
	
	@Override
	public String toString() {
		return "Work_Exp [id=" + id + ", exp_years=" + exp_years + "]";
	}
	
}
