package com.springboot.Ole.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "personname", unique = true, length = 45)
	private String name;
	
	@Column(name = "exchange", unique = true, length = 45)
	private String exchange;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(name = "username", nullable = false,  length = 45)
	private String username;
	
	@Column( nullable = false, length = 64)
	private String pasword;
	
	@Column(name = "mobile", unique = true, length = 45)
	private int mobile;
	
	
	public User(Long id, String name, String exchange, String email, String username, String pasword, int mobile) {
		super();
		
		this.name = name;
		this.exchange = exchange;
		this.email = email;
		this.username = username;
		this.pasword = pasword;
		this.mobile = mobile;
	}
	
	

	public User() {
	}


	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPasword() {
		return pasword;
	}


	public void setPasword(String pasword) {
		this.pasword = pasword;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	
	
	
	
	
	
}
