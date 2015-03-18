package com.milleans.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_account")
public class Account {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "isautoship")
	private int autoship;

	@Column(name = "annualfee")
	private double annualfee;

	@Column(name = "min_bv")
	private int minBv;

	@Column(name = "cpsn_id")
	private int cpsnId;

	@Column(name = "promotions")
	private int promotions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAutoship() {
		return autoship;
	}

	public void setAutoship(int autoship) {
		this.autoship = autoship;
	}

	public double getAnnualfee() {
		return annualfee;
	}

	public void setAnnualfee(double annualfee) {
		this.annualfee = annualfee;
	}

	public int getMinBv() {
		return minBv;
	}

	public void setMinBv(int minBv) {
		this.minBv = minBv;
	}

	public int getCpsnId() {
		return cpsnId;
	}

	public void setCpsnId(int cpsnId) {
		this.cpsnId = cpsnId;
	}

	public int getPromotions() {
		return promotions;
	}

	public void setPromotions(int promotions) {
		this.promotions = promotions;
	}

}
