package com.springboot.Ole.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "countrylist")

public class CountryList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "countrylist")
	private String countryList;
	
	public CountryList() {}
	
	public CountryList(String countryList) {
		super();
		this.countryList = countryList;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCountryList() {
		return countryList;
	}
	public void setCountryList(String countryList) {
		this.countryList = countryList;
	}
}
